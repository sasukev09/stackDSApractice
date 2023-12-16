import java.util.Stack;
// CREATING A STACK LIST OF MY FAVORITE FORTNITE SKINS
// FIRST SKIN IN IS MY FAVORITE, LAST SKIN IN IS MY LEAST FAVORITE
public class Main {
    public static void main(String[] args) {
        Stack<String> fortStack= new Stack<String>();

        //System.out.println(fortStack.empty())
        fortStack.push("Hybrid: Dragon Form");
        fortStack.push("Omega: Final Stage Form");
        fortStack.push("Ariana Grande");
        fortStack.push("Spike: Football Player");
        fortStack.push("Leviathan");


        System.out.println("Initial stack list fortStack has been created.");
        System.out.println("FortStack contains the following skins: " + fortStack);


        //I do not like Leviathan anymore, so I will remove that skin off the stack.
        //fortStack.pop();

        //I will remove Leviathan and add it to a String to store skins that are disliked.
        String noLikeStack = fortStack.pop();
        System.out.println("Removed selected skin and added to noLikeStack.");
        System.out.println("Updating lists....");

        //Printing the results after changes in lists
        System.out.println("The new Favorite skin list is: " + fortStack);
        System.out.println("The new Disliked skin list is: " + noLikeStack);

    }
}
