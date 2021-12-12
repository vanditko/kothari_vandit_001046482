/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.ConfigureAe;
import Business.Ecoe;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author dongyueli
 */
public class DB4OUtil {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString(); // path to the data store
    //"/Users/dongyueli/NetBeansProjects/lab/DataBank.db4o"
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecoe.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storee(Ecoe e) {
        ObjectContainer conn = createConnection();
        conn.store(e);
    System.out.println("Business.DB4OUtil.DB4OUtil.storee()  "+e);
        conn.commit();
        conn.close();
    }
    
    public Ecoe retrievee(){
        
        ObjectContainer conn = createConnection();
        System.err.println(" successful test");
        ObjectSet<Ecoe> es = conn.query(Ecoe.class); // Change to the object you want to save
        Ecoe e;
        if (es.size() == 0){
            e = ConfigureAe.configureABusiness();  // If there's no e in the record, create a new one
        }
        else{
            e = es.get(es.size() - 1);
        }
        conn.close();
        return e;
    }
}
