package IQ_Game;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public interface Constant {
	
	Set<Character> CHOICE_NO=new HashSet<>();
	Random random=new Random();
	int INITIAL_NUM_RANGE=10;
	int SKIP_COUNT=10;
	int LOOP_COUNT=4;
	String SPACING="   ";
	String BLANK="(--------)";
	
	
	//alp
	int CONVERT_CHAR=65;
	
	
	//choice
	int ANS_RANGE=20;
	
	

}
