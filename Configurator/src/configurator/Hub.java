/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

/**
 *
 * @author joser
 */
public class Hub {
    
    public String type, name, inf, subnet, netmask, internal;
    public static int hubNum = 21; 
    
    Hub (String n) {
        this.type = "hub";
        this.name = n;
        
        this.internal = "vinf" + hubNum;
        hubNum++;
        //System.out.println(this.internal);
        
        System.out.println("New object created: " + this.type + " - " + this.name);
    }
    
    public String generateString() {
        String finalstr;
        finalstr = this.type + " " + this.name + " { \n";
        if (this.inf != null && !this.inf.equals("")) { finalstr += "\tinf : " + this.inf + " \n"; }
        if (this.subnet != null && !this.subnet.equals("")) { finalstr += "\tsubnet : \"" + this.subnet + "\" \n"; }
        if (this.netmask != null && !this.netmask.equals("")) { finalstr += "\tnetmask : \"" + this.netmask + "\" \n"; }
        finalstr += "}\n\n";
        
        return finalstr;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getInf() {
        return inf;
    }
    
    public void setInf(String inf) {
        this.inf = inf;
    }
    
    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }
}
