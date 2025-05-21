package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力
	public String gerMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
		    System.out.println("グーはrockのrを入力しましょう");
		    System.out.println("チョキはscissorsのsを入力しましょう");
		    System.out.println("パーはpaperのpを入力しましょう");
		    
		    String input = scanner.next();
		    
		    if((input.equals("r")) || (input.equals("s")) || (input.equals("p"))){
		    	scanner.close();
		    	return input;
		    } else {
		    	System.out.println("入力が正しくありません。");
		    	continue;
		    	
		    }
		}
	}
     
		
	//相手のじゃんけんの手
	public String getRandom() {
		String [] player2 = {"r", "s" , "p"};
		
		int n = (int)(Math.floor(Math.random() * 2));
		
		return player2[n];
		
	}
	
	
	//自分と対戦相手のじゃんけんの手を出力
    public void playGame() {
    	HashMap<String,String> choice = new HashMap<String,String>();
    	
    	choice.put("r", "グー");
    	choice.put("s", "チョキ");
    	choice.put("p", "チョキ");
    	
    	String me = this.gerMyChoice();
    	String you = this.getRandom();
    	
    	System.out.println("自分の手は" + choice.get(me) + ",対戦相手の手は" + choice.get(you));
    	
    	//あいこ
    	if( me.equals(you)) {
    		System.out.println("あいこです");
    	}
    	//自分が勝ち
        if((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
           || (me.equals("p") && you.equals("r"))){
        	   System.out.println("自分の勝ちです");
        }
        //相手が勝ち
        if((me.equals("s") && you.equals("r")) || (me.equals("p") && you.equals("s"))
                || (me.equals("r") && you.equals("p"))){
     	   System.out.println("自分の負けです");
        }
    }
	
	
		
		
		
		
		
	

}
