/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author joser
 */
public class Hub {
    
    public String type, name, subnet, netmask, internal;
    public String inf;
    public ArrayList<String> infList;
    public static int hubNum = 21; 
    
    Hub (String n) {
        this.infList = new ArrayList<>();
        this.type = "hub";
        this.name = n;
        this.inf = "";
        this.internal = "vinf" + hubNum;
        hubNum++;
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
    
    public void generateInf() {
        if (infList.size() > 0) {
            for (int i = 0; i < infList.size(); i++) {
                if (i == 0) {
                    this.inf = infList.get(i);
                } else {
                    this.inf += ", " + infList.get(i);
                }
            }
        } else {
            this.inf = "";
        }
    }
    
    public void addInf(String string) {
        if (!this.infList.contains(string)) {
            this.infList.add(string);
            generateInf();
        }
    }
    
    public void removeInf(String string) {
        if (this.infList.contains(string)) {
            this.infList.remove(string);
            generateInf();
        }
    }
    
    public void removeVM(String name) {
        for (Iterator<String> iterator = this.infList.iterator(); iterator.hasNext();) {
            String listItem = iterator.next();
            if (listItem.contains(name)) {
                iterator.remove();
            }
        }
        generateInf();
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
    
    public String getInternal() {
        return internal;
    }
}
