import org.libvirt.*;

public class host {
    public String hostdata(Connect conn)
    {            try
                 {NodeInfo nodeInfo = conn.nodeInfo();
            System.out.println("virNodeInfo.model:" + nodeInfo.model);
            System.out.println("virNodeInfo.memory:" + nodeInfo.memory);
            System.out.println("virNodeInfo.cpus:" + nodeInfo.cpus);
            System.out.println("virNodeInfo.nodes:" + nodeInfo.nodes);
            System.out.println("virNodeInfo.sockets:" + nodeInfo.sockets);
            System.out.println("virNodeInfo.cores:" + nodeInfo.cores);
            System.out.println("virNodeInfo.threads:" + nodeInfo.threads);

            // Exercise the information getter methods
            System.out.println("getHostName:" + conn.getHostName());
            System.out.println("getMaxVcpus:" + conn.getMaxVcpus("qemu"));
            System.out.println("getType:" + conn.getType());
            System.out.println("getURI:" + conn.getURI());
            System.out.println("getVersion:" + conn.getVersion());
            System.out.println("getLibVirVersion:" + conn.getLibVirVersion());
            System.out.println("getCapabilities:" + conn.getCapabilities());
           
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
