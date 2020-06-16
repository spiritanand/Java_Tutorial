public class B2_C_Main {
    public static void main(String[] args){
        B2_C_Computer myPC = new B2_C_Computer("SMPC","Linux","Acer Aspire",2.2, 8, 99);
        System.out.println("This is "+myPC.getName()+" that runs on "+myPC.getOS()+". " +
                "It weighs "+myPC.getWeight()+"kg and has "+myPC.getPorts()+" ports.");
        myPC.on();
        myPC.calculate();
        myPC.off();

        // Alright now that we have seen the seen the pretty old class in action now let us see how inheritance
        // works. Jump into the Apple class.


        // Now that we have created our (sub)class Apple lets have some fun with it.

        B2_C_Apple myMac = new B2_C_Apple("myMac","Macbook Pro 15",1.5,4,99,
                true,true);
        System.out.println("This is "+myMac.getName()+" that runs on "+myMac.getOS()+". " +
                "It weighs "+myMac.getWeight()+"kg and has "+myMac.getPorts()+" ports." +
                "Glowing Apple Logo :- "+myMac.isGlowLogo()+" Touchbar included :- "+myMac.isTouchbar());
        // Now lets have some fun with the methods.
        // Lets have a look at our overridden method.
        myMac.on();
        myMac.calculate(); // Our inherited method from the Computer superclass.
        myMac.off();
        // Notice the messages that are outputted and their order.
        // We have now seen how inherited classes work.
        // Now jump back to B2_Inheritance for some more in-depth discussions.
    }
}
