interface Shop{  
    int productPrice();
}  
class RELIANCE implements Shop{  
    public int productPrice(){return 45;}
}  
class SARAVANA implements Shop{  
    public int productPrice(){return 40;}  
}  
class TestShop{  
    public static void main(String[] args){  
        Shop b=new RELIANCE();  
        System.out.println("Reliance price: "+b.productPrice());
    }
}   
