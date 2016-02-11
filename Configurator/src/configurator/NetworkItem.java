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
public class NetworkItem {
    public String type, name, os, ver, src, eth0, eth1, inf, subnet, netmask;
    
    NetworkItem (String t, String n) {
        type = t;
        name = n;
        System.out.println("New object created: " + this.type + " - " + this.name);
    }
    
    public void setos(String s) {
        this.os = s;
    }
    public void setver(String s) {
        this.ver = s;
    }
    public void setsrc(String s) {
        this.src = s;
    }
    public void seteth0(String s) {
        this.eth0 = s;
    }
    public void seteth1(String s) {
        this.eth1 = s;
    }
    public void setinf(String s) {
        this.inf = s;
    }
    public void setsubnet(String s) {
        this.subnet = s;
    }
}
