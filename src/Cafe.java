class Cafe {
    private String designation;
    String cafeName;
    String strAction;

    public Cafe(String designation, String schoolName) {
        super();

        this.designation = designation;
        this.cafeName = schoolName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }


    //method of parent class
    void does() {
        System.out.println("\tCoffee. Culture. Community");
    }

    //overloading
    private void does(String strAction) {
        this.strAction = strAction;
        System.out.println("\tCoffee. Culture. Community - " + strAction);
    }
}