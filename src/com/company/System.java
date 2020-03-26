package com.company;


public class System {

    private String make;
    private String model;
    private int speed;
    private int memorySize;
    private double hardDiskSize;
    private double purchaseCost;

    public System(String makeIn, String modelIn, int speedIn) {
        this.make = makeIn;
        this.model = modelIn;
        this.speed = speedIn;
    }


    public void setMemory(int memorySizeIn)
    {
        this.memorySize = memorySizeIn;
    }

    public void setHardDisk(double hardDiskSizeIn)
    {
        this.hardDiskSize = hardDiskSizeIn;
    }

    public void setPurchaseCost(double purchaseCostIn)
    {
        this.purchaseCost = purchaseCostIn;
    }

    public String getMake()
    {
        return this.make;
    }

    public String getModel()
    {
        return this.model;
    }

    public int getProcessorSpeed()
    {
        return this.speed;
    }

    public String displayDetails()
    {

        String details = String.format(
                "Make: %s \n Model: %s \n Processor Speed: %s \n Memory Size: %s \n Hard Disk Size: %s \n Purchase Cost: %s",
                getMake(), getModel(), getProcessorSpeed(), memorySize, hardDiskSize, purchaseCost);


        return details;

    }

    public String checkHDStatus()
    {
        if(hardDiskSize < 2)
        {
            return "low";
        }
        else return "OK";
    }

    public boolean goodMemorySize()
    {
        if (memorySize < 128)
        {
            return false;
        }
        else return true;
    }

    public String diagnoseSystem()
    {
        String details = String.format("Hard Disk Size: %s \n Memory Size OK: %s", checkHDStatus(), goodMemorySize());
        return details;
    }

    public String displaySystemProperties()
    {

        String concatMessage;

        // create systemProperties string and concatenating all system properties to the string

        String systemProperties = "Operating System Architecture: " + java.lang.System.getProperty("os.arch") + "\n" + "Operating System Name: "
                + java.lang.System.getProperty("os.name") +"\n" + "Operating System Version: " + java.lang.System.getProperty("os.version") + "\n"
                + "User Account Name: " + java.lang.System.getProperty("user.name") + "\n" +"Java Version: " + java.lang.System.getProperty("java.version");


        // determining OS and concat appropriate message to systemProperties

        if(java.lang.System.getProperty("os.version").equals("Windows 10"))
        {
            concatMessage = "Good OS choice!";
        }
        else if(java.lang.System.getProperty("os.version").equals("Linux"))
        {
            concatMessage = "A fair OS";
        }
        else
        {
            concatMessage = "Poor choice of OS...";
        }

        systemProperties = systemProperties.concat("\n" + concatMessage);


        return systemProperties;

    }



}


