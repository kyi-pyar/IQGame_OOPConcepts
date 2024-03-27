package IQ_Game;

public class Alphabatic_Game implements GameControl{
	
	//start, skip
	int start;
	int skip;
	String question;
	
	public Alphabatic_Game() {
		start=Constant.random.nextInt(Constant.INITIAL_NUM_RANGE);//5
		skip=Constant.random.nextInt(Constant.SKIP_COUNT)+1;//3
	}	

	@Override
	public String generateQuestion() {// 3 5 7 9 11
		question=(char)((start+Constant.CONVERT_CHAR))+Constant.SPACING;//B
		for(int i=0;i<Constant.LOOP_COUNT-1;i++) {
		  start=start+skip;
		  if(start > 25) start=start-26;
		  question+= (char)((start+Constant.CONVERT_CHAR))+Constant.SPACING;	 
		}	
		start=start+skip;
		return question;
	}
	@Override
	public void diplayQuestion() {// a c e f
		System.out.println(generateQuestion()+Constant.BLANK);
		
	}

	@Override
	public boolean check_ans() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCor_ans() {
		// TODO Auto-generated method stub
		return start;
	}

}
