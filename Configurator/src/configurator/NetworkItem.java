
package configurator;

public class NetworkItem {
    public String type, name, os, ver, src, eth0, eth1, eth2, inf, subnet, netmask;
    
    NetworkItem (String t, String n) {
        type = t;
        name = n;
        System.out.println("New object created: " + this.type + " - " + this.name);
    }
}
