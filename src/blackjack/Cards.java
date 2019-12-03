package blackjack;

public class Cards {
	
	private Suits cardSuit;
        private Rank cardRank;
	public Cards(Suits suit, Rank rank)
        {
           this.cardRank=rank;
           this.cardSuit=suit;
        }
	
	public int getCardNumber()
        {
            int cardNum = 0;
	
                    if(cardRank.equals("King") || cardRank.equals("Queen") || cardRank.equals("Jack"))
                    {
                        cardNum=10;
                    }
                    else
                    {
                        cardNum = (cardRank.ordinal()+1);
                    }
          
                        
                        
		return cardNum;
	}
	
	public String toString(){
            return this.cardRank.toString()+" of "+this.cardSuit.toString();
	}
	
	
	
}
