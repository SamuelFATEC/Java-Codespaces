import java.util.Stack;

public class MatchingTags{
    public static void main(String [] args){
        String code1 = "<body><center><h1> The Little Boat </h1></center><p> The storm tossed the littleboat like a cheap sneaker in anold washing machine. The threedrunken fishermen were used tosuch treatment, of course, butnot the tree salesman, who even asa stowaway now felt that hehad overpaid for the voyage. </p><ol><li> Will the salesman die? </li><li> What color is the boat? </li><li> And what about Naomi? </li></ol></body>";
        String [] tags = getTags(code1);
        Stack<String> stack = new Stack<>();
        for(String tag:tags){
            if(tag.startsWith("</")){
                if(canPop(stack, tag)){
                    stack.pop();
                }
            }
            else{
                stack.push(tag);
            }
            boolean decision = canPop(stack, tag);
            if(decision == true){
                stack.pop();
            }
        }
        System.out.println("A pilha está vazia? " + stack.empty());
        if(stack.empty()==false){
            System.out.println(stack.peek());
        }
        Stack<String> stack2 = new Stack<>();
        String code2 = "<body><center><h1>The Little Boat</h1></center><p>The storm tossed the little boat like a cheap sneaker in an old washing machine.The three drunken fishermen were used to such treatment, of course, but not the tree salesman,who even as a stowaway now felt that he had overpaid for the voyage.<ol><li>Will the salesman die?</li><li>What color is the boat?</li><li>And what about Naomi?</li></ol></body>";
        String [] tags2 = getTags(code2);
        for(String tag2 : tags2){
            if(tag2.startsWith("</")){
                if(canPop(stack2, tag2)){
                    stack2.pop();
                }
            }
            else{
                stack2.push(tag2);
            }
            boolean decision2 = canPop(stack2, tag2);
            if(decision2 == true){
                stack2.pop();
            }
        }
        System.out.println("A pilha está vazia? " + stack2.empty());
        if(stack2.empty()==false){
            System.out.println(stack2.peek());
        }
    }

    public static int getLength(String code){
        int n=0;
        int nTags = 0;
        while((nTags = code.indexOf('<', nTags)) != -1){
            nTags++;
            n++;
        }
        return n;
    }

    public static String [] getTags(String code){
        int n = getLength(code);
        int beginPos = 0;
        int conTags = 0;
        String [] tags = new String[n];    
        for(int i = 0; i < code.length(); i++){
            int startPos = code.indexOf('<', beginPos);
            int endPos = code.indexOf('>', startPos);
            if(startPos == -1 || endPos == -1){
                break;
            }
            tags[conTags] = code.substring(startPos, endPos + 1);
            conTags++;
            beginPos = endPos + 1;
        }
        return tags;
    }

    public static boolean canPop(Stack<String> stack, String tag){
        if(stack.empty()){
            return false;
        }
        String topTag = stack.peek();

        String tagOpen =topTag.substring(1, topTag.length()-1);
        String tagClosed = tag.substring(2, tag.length()-1);

        return(tagOpen.equals(tagClosed));
    }
}