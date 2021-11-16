package com.example.as_c4_sp1_viewpager_task1;

public class Rocket
{
    private String Name;
    private int launch;
    private String nameCompany;
    private int img;

    public Rocket(String Name, int launch, String nameCompany, int img)
    {
        this.Name = Name;
        this.launch = launch;
        this.nameCompany = nameCompany;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String fullName) {
        this.Name = fullName;
    }

    public int getLaunch() {
        return launch;
    }

    public void setLaunch(int launch) {
        this.launch = launch;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String position) {
        this.nameCompany = position;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
