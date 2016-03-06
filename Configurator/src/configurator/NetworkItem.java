
package configurator;

import java.util.HashMap;

public class NetworkItem {
    public String type, name, os, ver, src, eth0, eth1, eth2, inf, subnet, netmask, internal;
    public static int hubNum = 21;
    public HashMap<String, String> connections = new HashMap<>();
    
    NetworkItem (String t, String n) {
        this.type = t;
        this.name = n;
        if (!t.equals("null") && t.equals("hub")) {
            this.internal = "vinf" + hubNum;
            hubNum++;
            //System.out.println(this.internal);
        }
        System.out.println("New object created: " + this.type + " - " + this.name);
    }
    
    public String generateString() {
        String finalstr;
        finalstr = this.type + " " + this.name + " { \n";
        if (this.os != null && !this.os.equals("")) { finalstr += "\tos : " + this.os + " \n"; }
        if (this.ver != null && !this.ver.equals("")) { finalstr += "\tver : \"" + this.ver + "\" \n"; }
        if (this.src != null && !this.src.equals("")) { finalstr += "\tsrc : \"" + this.src + "\" \n"; }
        if (this.eth0 != null && !this.eth0.equals("")) { finalstr += "\teth0 : \"" + this.eth0 + "\" \n"; }
        if (this.eth1 != null && !this.eth1.equals("")) { finalstr += "\teth1 : \"" + this.eth1 + "\" \n"; }
        if (this.eth2 != null && !this.eth2.equals("")) { finalstr += "\teth2 : \"" + this.eth2 + "\" \n"; }
        if (this.inf != null && !this.inf.equals("")) { finalstr += "\tinf : " + this.inf + " \n"; }
        if (this.subnet != null && !this.subnet.equals("")) { finalstr += "\tsubnet : \"" + this.subnet + "\" \n"; }
        if (this.netmask != null && !this.netmask.equals("")) { finalstr += "\tnetmask : \"" + this.netmask + "\" \n"; }
        finalstr += "}\n";
        
        return finalstr;
    }
    
    public void addConn(String param, String conn) {
        connections.put(param, conn);
        //System.out.println("Added solution " + param + ", " + conn + " to object " + this.name);
    }
}
