import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/*
1. Find out the newsId which has received maximum comments.

2. Find out how many times the word 'budget' arrived in user comments all news.

3. Find out which user has posted maximum comments.

4. Display commentByUser wise number of comments.*/


class News
{
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	
	public News()
	{
		
	}
	
	public News(int newsId, String postedByUser,String commentByUser,String comment)
	{
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
		
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString()
	{
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	
}


public class Assignment5Q2 
{
	public static int maxComments(List<News> news)
	{
		Optional<News> comments = news.stream().max(Comparator.comparing(News::getComment));
    
    	List<Integer> maxC = new ArrayList<>();
    	comments.stream().forEach(i->{int id =i.getNewsId(); maxC.add(id);});
    	int i = maxC.stream().findFirst().get();
    	return i;
	}
	
	public static int budgetCount(List<News> news)
	{
		int count=0;
		List<String> budgetCount=new ArrayList<>();
		news.stream().forEach(i->budgetCount.add(i.getComment()));
		
		for(String s:budgetCount)
		{
			if(s.contains("budget"))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static String maxCommentsByUser(List<News> news)
	{
		Optional<News> maxUser = news.stream().max(Comparator.comparing(News::getCommentByUser));  
    	List<String> userNames = new ArrayList<>(); 
    	maxUser.stream().forEach(j->userNames.add(j.getCommentByUser()));
    	String finalName = userNames.stream().findFirst().get();
    	return finalName;
	}
	
	//Tree Map Sorting
	
	public static  <K,V extends Comparable<V>> Map<K,V>
	sortByValues(final Map<K,V>map)
	{
		Comparator<K> valueComparator=new Comparator<K>()
				{
			public int compare(K k1, K k2)
			{
				int compare=map.get(k2).compareTo(map.get(k1));
				if(compare==0)
				{
					return 1;
				}else
				{
					return compare;
				}
			}
				};
				
				Map<K,V> sortedByValues= new TreeMap<K,V>(valueComparator);
				
				sortedByValues.putAll(map);
				return sortedByValues;
				
	}
	 public static Map<String, Integer> sortMaxCommentsByUser (List < News > news)
	 {
		 Map<String,Integer> mp = new TreeMap<>();
		 List<String> byUser  = new ArrayList<String>();
		 news.stream().forEach(i->byUser.add(i.getCommentByUser()));
		 
		 for(String user:byUser)
		 {
			 mp.put(user, 0);
		 }
		 
		 for(String user:byUser)
		 {
			 mp.put(user, mp.get(user)+1);
		 }
		 
		 Map<String,Integer> mp2=sortByValues(mp);
		 return mp2;
		 
		 
	 }
	 
	 public static void main(String args[])
	 {
		 
	 }
	
	
}
