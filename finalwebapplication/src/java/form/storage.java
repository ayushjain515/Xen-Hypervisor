package form;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import org.libvirt.*;
import org.xml.sax.SAXException;

public class storage {
    
    public String create(Connect conn ,String t)
    {
        try
        {
            StoragePool sp=conn.storagePoolLookupByUUIDString("defailt");
            String volume="<volume>"
                                + "<name>sparse.img</name>  "
                                + "   <allocation>0</allocation>"
                                + " <capacity unit=\"T\">1</capacity>"
                                + "        <target>"
                                + "<path>/var/lib/virt/images/sparse.img</path>"
                                + "<permissions>"
                                + "<owner>107</owner>"
                                + "<group>107</group>"
                                + "            <mode>0744</mode>   "
                                + "         <label>virt_image_t</label>    "
                                + ""
                                + "      </permissions>"
                                + "        </target>    "
                                + "  </volume>";
            int flag = 0;
            StorageVol sv= sp.storageVolCreateXML(volume,flag );
            if (sv!=null)
            {System.out.println("volume create "+sv.getKey());
            }
            
        }
        catch(LibvirtException e)
        {
            System.out.println(e);
        }
        
        return "1";
    }
    public String storage(Connect conn) throws ParserConfigurationException, SAXException, IOException
    {
       try
       {System.out.println(conn.numOfStoragePools()); 
                        
                         Set s = new HashSet(Arrays.asList( conn.listStoragePools()));
                         Iterator i = s.iterator();
                         while (i.hasNext())
                         {
                            StoragePool spi=conn.storagePoolLookupByName((String) i.next());
                            StoragePoolInfo spif=spi.getInfo();
                            System.out.println(spi.getName());
                            String des=spi.getXMLDesc(0);
                            System.out.println( spif.allocation +","+ spif.available+","+spif.capacity+","+spif.state+","+ spi.getUUIDString()+"\n"+ spi.isActive()+"--"+ spi.isPersistent()+"--"+spi.numOfVolumes()+"--"+des);
                           
                           
                            Set s1 = new HashSet(Arrays.asList( spi.listVolumes()));
                            Iterator i1 = s1.iterator();
                           
                         while (i1.hasNext())
                         {
                             //StorageVol stv=conn.storageVolLookupByPath("/var/lib/libvirt/images/"+i1.next().toString());
                             //System.out.println(stv.getPath()+stv.getName()+stv.getXMLDesc(0));
                           
                             StorageVol svi=spi.storageVolLookupByName(i1.next().toString());
                             StorageVolInfo si=svi.getInfo();
                            
                             System.out.println("allocated="+si.allocation);
                             System.out.println("capacity="+si.capacity);
                             System.out.println("type="+si.type);
                             System.out.println("name="+svi.getName());
                             System.out.println("path="+svi.getPath());
                         }
                         
                           }
                         System.out.println(); 
           return"1";
                 } 
                catch(LibvirtException e) 
                 {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
                        return "0";  
                  }
    }
    
    
}
