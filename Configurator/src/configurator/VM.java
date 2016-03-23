/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.HashMap;

/**
 *
 * @author joser
 */
public class VM {
    
    public String type, name, os, ver, src, eth0, eth1, eth2;
    public HashMap<String, String> connections = new HashMap<>();
    
    VM (String n) {
        this.type = "vm";
        this.name = n;
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
        finalstr += "}\n\n";
        
        return finalstr;
    }
    
    public String getSolutionString() {
        String finalstr = "";
        for (String port : connections.keySet()) {
            finalstr += "(" + this.name + "." + port + " " + connections.get(port) + "),\n";
        }
        return finalstr;
    }
    
    public String addConn(String port, String conn) {
        if (connections.get(port) != null) {
            return "That port is already connected to something.";
        } else {
            connections.put(port, conn);
            return "Added solution " + port + ", " + conn + " to object " + this.name;
        }
    }
    
    public String removeConn(String port) {
        if (connections.get(port) != null) {
            connections.remove(port);
            return "Solution removed for " + this.name + "." + port;
        } else {
            return "Can't remove connection that doesn't exist.";
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    public String getEth0() {
        return eth0;
    }

    public void setEth0(String eth0) {
        this.eth0 = eth0;
    }
    public String getEth1() {
        return eth1;
    }

    public void setEth1(String eth1) {
        this.eth2 = eth1;
    }
    public String getEth2() {
        return eth2;
    }

    public void setEth2(String eth2) {
        this.eth2 = eth2;
    }
}
