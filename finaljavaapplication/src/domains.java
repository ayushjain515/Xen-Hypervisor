
import java.sql.Connection;
import java.util.*;
import org.libvirt.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author punit
 */
public class domains {
    
    public String migrate(Connect conn)
    {  try
                 {   Connect conn1 = new Connect("qemu+ssh://punit@192.168.102.133/system", false);
                             Domain d=conn.domainLookupByName("dos");
                             
                        Domain s= d.migrate(conn1,1,"dos","tcp://punit@192.168.102.133:49152",0);
                         return "1";
                    }
                 catch (LibvirtException e) 
                 {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
                        return "0";  
                  }
   
    }
    
    public String create(Connect conn)
    {  try
                 {  long startTime = System.currentTimeMillis();
                 
                     String dumpxml = "<domain type='qemu'>"+
			  "<name>tt2</name>"+
			  "<memory>1048576</memory>"+
			  "<currentMemory>1048576</currentMemory>"+
			  "<vcpu>1</vcpu>"+
			  "<os>"+
			  "  <type arch='i686' machine='pc-0.11'>hvm</type>"+
			  "  <boot dev='hd'/>"+
			  "</os>"+
			  "<features>"+
			  "  <acpi/>"+
			  "  <apic/>"+
			   " <pae/>"+
			  "</features>"+
			  "<clock offset='utc'/>"+
			  "<on_poweroff>destroy</on_poweroff>"+
			  "<on_reboot>restart</on_reboot>"+
			  "<on_crash>restart</on_crash>"+
			  "<devices>"+
			  "  <emulator>/usr/bin/qemu</emulator>"+
			  "  <disk type='file' device='disk'>"+
			  "    <driver name='qemu' cache='none'/>"+
			  "    <source file='/var/lib/libvirt/images/tt2.img'/>"+
			  "    <target dev='hda' bus='ide'/>"+
			  "  </disk>"+
			  "  <interface type='network'>"+
			  "    <mac address='54:52:00:02:02:2c'/>"+
			  "    <source network='default'/>"+
			  "  </interface>"+
			  "  <serial type='pty'>"+
			  "    <target port='0'/>"+
			  "  </serial>"+
			  "  <console type='pty'>"+
			  "    <target port='0'/>"+
			  "  </console>"+
			  "  <input type='mouse' bus='ps2'/>"+
			  "  <graphics type='vnc' port='-1' autoport='yes' keymap='en-us'/>"+
			  "</devices>"+
			"</domain>";
                 Domain dm = null;
			try
                        {
				dm =conn.domainLookupByName("tt2");
                                
			}
			catch (LibvirtException e) {
				// TODO: handle exception
			}
                        if(dm!=null)
                        {System.out.println("domain already exist");}
                        else
                        {
                           String volume="<volume>"
                                + "<name>tt2.img</name>  "
                                + "   <allocation>10000</allocation>"
                                + " <capacity unit=\"M\">10001</capacity>"
                                + "        <target>"
                                + "<path>/var/lib/virt/images/tt2.img</path>"
                                + "<permissions>"
                                + "<owner>107</owner>"
                                + "<group>107</group>"
                                + "            <mode>0744</mode>   "
                                + "         <label>virt_image_t</label>    "
                                + ""
                                + "      </permissions>"
                                + "        </target>    "
                                + "  </volume>"; 
                           
                           StoragePool sp=conn.storagePoolLookupByName("default");
                           int flag = 0;
                           StorageVol sv= sp.storageVolCreateXML(volume,flag );
                          if (sv!=null)
                            {System.out.println("volume create "+sv.getKey());
                           Domain d=conn.domainDefineXML(dumpxml);
                           d.create();
                           
                            }
                          
                           
                       
                        } 
                        long stopTime = System.currentTimeMillis();
                        long elapsedTime = stopTime - startTime;
                        System.out.println(elapsedTime);
                        return "1";
                    }
                 catch (LibvirtException e) 
                 {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
                        return "0";  
                  }
   
    }
   
    
    public String domain(Connect conn)
    {
     try
                 {       
                         System.out.println(conn.numOfDefinedDomains());
                         Set s = new HashSet(Arrays.asList(  conn.listDefinedDomains()));
                         Iterator i = s.iterator();
                         while (i.hasNext())
                         {String d1=i.next().toString();
                             Domain d=conn.domainLookupByName(d1);
                             System.out.println(d1);
                         //System.out.println(d.getName()+"--\n"+d.getMaxMemory()/1024+d.getXMLDesc(0));
                         } 
                         int []a; 
                           a=  conn.listDomains();
                         int j=a.length-1;
                       while(j>=0)
                       {
                            Domain d=conn.domainLookupByID(a[j]);
                             System.out.println(j+"-"+d.getName());
                             //System.out.println(d.getName()+"--\n"+d.getMaxMemory()/1024+d.getXMLDesc(0));
                       
                             j--;
                       } 
                        
                         return "1";
                    }
                 catch (LibvirtException e) 
                 {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
                        return "0";  
                  }
    
    }
    
}
