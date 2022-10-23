public class Challenge {
    public static void main(String[] args)
    {
        // dice roller
        /* creates a loop and randomly generates a number between
        1 and 6 to print */
        int i = 1;
        int rollNum;
        while(i <= 20)
        {
            rollNum = (int) (Math.random() * 6) + 1;
            System.out.println("Roll " + i + " = " + rollNum);
            i++;

            
            
        }
        // die class problem test
        /* makes three dice and tests whether read last die works*/
        Die firstDie = new Die();
        Die secondDie = new Die(3);
        Die thirdDie = new Die(10);

        System.out.println(firstDie.readLastRoll());
        System.out.println(firstDie.roll());
        System.out.println(firstDie.readLastRoll());

        System.out.println(secondDie.readLastRoll());
        System.out.println(secondDie.roll());
        System.out.println(secondDie.readLastRoll());

        System.out.println(thirdDie.readLastRoll());
        System.out.println(thirdDie.roll());
        System.out.println(thirdDie.readLastRoll());    }
}
