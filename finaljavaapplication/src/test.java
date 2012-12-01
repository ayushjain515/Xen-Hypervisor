import com.sun.jna.Pointer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import org.libvirt.*;
import org.libvirt.jna.StoragePoolPointer;
import org.libvirt.jna.StorageVolPointer;
import org.xml.sax.SAXException;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Connect conn = null;
		int flags = 0;

		try {
			
			
			conn = new Connect("qemu:///system", false);
                       //  host h=new host();
                        // h.hostdata(conn);
			 System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");
                        storage s=new storage();
                        s.storage(conn);
                         //System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");
               
                         
                         
                         //System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");
               
			domains d=new domains();
                        //d.domain(conn);
                       // d.create(conn);
                        //d.migrate(conn);
		} catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());

			return;
		}
        
        

	}

}