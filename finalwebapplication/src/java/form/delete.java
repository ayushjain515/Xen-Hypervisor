package form;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.libvirt.Connect;
import org.libvirt.Domain;
import org.libvirt.LibvirtException;
import org.libvirt.DomainInfo;
import org.libvirt.DomainJobInfo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidharth
 */
public class delete {
    private static Domain d1;
    
    public void delete(String name) throws LibvirtException
    {Connect conn;
      
            conn = new Connect("qemu:///system", false);
       
                         
			domains d=new domains();        //DOMAIN CLASS CALLED
                        d1=conn.domainLookupByName(name);
                        
                        d1.undefine();
    }
    public static void main(String[] args) throws LibvirtException 
    {
    }
}
