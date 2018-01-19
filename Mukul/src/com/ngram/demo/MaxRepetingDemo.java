package com.ngram.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxRepetingDemo 
{
	public static void main(String[] args) 
	{
		String s="Cricket is most popular and favourite game of everyone. We like cricket very much and play in daily evening in the small play ground. It is liked by the people of almost all age group as it is very interesting and suspicious game. There is no any accurate prediction that a particular team would win. At the last moment any of teams may win which increases the enthusiasm of everyone. People have their own favourite team which they want to win and see until the cricket game become over and they get some result. There become a big crowd of cricket lovers in the stadium and TV rooms to see the cricket whenever any test match, national level or international level competition takes place.\r\n" + 
				"Young boys are highly affected by this game and almost everyone wants to be a good cricketer. Cricket is not an Indian native game however played with lots of enthusiasm and joy. Cricket is played in many countries England, India, Pakistan, Ireland, West Indies, Sri Lanka, Netherlands, Australia, South Africa, New Zealand, Zimbabwe, Bangladesh, etc. Cricket matches are generally played for five days with one Rest-Day. Cricket match is played with two teams of 11 players in each and whole test match contains two innings of first innings and second innings. Win and loss in the cricket by any team depends on the highest total runs scored by the teams in their two innings. And the team getting maximum runs at the end of the game is declared as the winner of that day match.\r\n" + 
				"Cricket is not a simple game however can be learned and practiced on regular basis by following all the rules and regulations of the cricket. There is two main player called one batsman and one bowler at a time and both are changed timely whenever they become out or completed their all number of balls and overs. Before starting the cricket match, a coin is tossed to decide which team would start the batting first. The team who win the toss starts batting first and opponent team do bowling however both of the teams get chance of batting and bowling alternatively. Winning and defeating are two aspects of the cricket game which have made this cricket game most interesting and suspicious. Whenever the batsman through the ball for chauka and chhakka, the whole cricket ground and stadium becomes full of high tuned sound of the cricket lovers especially when the most favourite team do batting.\r\n" + 
				"";
		s=s.replaceAll("[.,]","");
		
		
				
		Map<String, Integer> map=new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);
		String[] arr=s.split(" ");
		for(String word:arr)
		{
			
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		Comparator<Entry<String,Integer>> cmp=new Comparator<Entry<String,Integer>>() {

			

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
			{
				return o2.getValue()-o1.getValue();
				
				
			}
		};
		
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,cmp);
		int count=1;
		/*int i=map.get("Game");
		System.out.println(i);*/
		for(Map.Entry<String,Integer> entry: list)
		{
			if(count<4)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
				count++;
			}
			
		}
		//System.out.println(map);
	}
}
