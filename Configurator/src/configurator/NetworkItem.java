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
    public String type, name, os, ver, src, eth0, eth1, eth2, inf, subnet, netmask;
    
    NetworkItem (String t, String n) {
        type = t;
        name = n;
        System.out.println("New object created: " + this.type + " - " + this.name);
    }
    /*
    public void setos(String s) {
        this.os = s;
        System.out.println("OS of " + this.name + " set to " + this.os);
    }
    public void setver(String s) {
        this.ver = s;
        System.out.println("Ver of " + this.name + " set to " + this.ver);
    }
    public void setsrc(String s) {
        this.src = s;
        System.out.println("Src of " + this.name + " set to " + this.src);
    }
    public void seteth0(String s) {
        this.eth0 = s;
        System.out.println("Eth0 of " + this.name + " set to " + this.eth0);
    }
    public void seteth1(String s) {
        this.eth1 = s;
        System.out.println("Eth1 of " + this.name + " set to " + this.eth1);
    }
    public void setinf(String s) {
        this.inf = s;
        System.out.println("Inf of " + this.name + " set to " + this.inf);
    }
    public void setsubnet(String s) {
        this.subnet = s;
        System.out.println("Subnet of " + this.name + " set to " + this.subnet);
    }
    
    public void setnetmask(String s) {
        this.subnet = s;
        System.out.println("Netmask of " + this.name + " set to " + this.netmask);
    }
    */
}
