//Single Responsiblity

class product 
{
    String name;
    double price;
    Product(String name,double price)
    {
        this.name = name;
        this.price= price;
    }
}

//O+D

interface Payment
{
    void pay()
}