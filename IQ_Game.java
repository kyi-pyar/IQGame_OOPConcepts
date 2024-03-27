package IQ_Game;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IQ_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameControl a_game=new Alphabatic_Game();
		GameControl age_game=new Age_Game();
		
		List<GameControl> games=Arrays.asList(a_game, age_game);		
		games.stream().forEach(game->game.diplayQuestion());		
		Answer ans=new Answer();
		Map<Character,Integer> map=ans.generate_Multiple_Choice(age_game.getCor_ans());		
		map=ans.generate_Multiple_Choice(a_game.getCor_ans());
		Set<Entry<Character,Integer>> set=map.entrySet();
		Iterator<Entry<Character,Integer>> it=set.iterator();
		while(it.hasNext()) {
			Entry<Character,Integer> entry=it.next();
			System.out.print(entry.getKey()+")"+entry.getValue()+Constant.SPACING);			
		}	
		
	}

}
