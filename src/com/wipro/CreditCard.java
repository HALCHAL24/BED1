package com.wipro;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class CreditCard {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "pan_num")
	private String PanNum;

	@Column(name = "credit_score")
	private double CreditScore;
        
        public CreditCard()
	{

	}

	public CreditCard(String panNum, double creditScore) 
	{
		super();
		PanNum = panNum;
		CreditScore = creditScore;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getPanNum() {
		return PanNum;
	}

	public void setPanNum(String panNum)
	{
		PanNum = panNum;
	}

	public double getCreditScore()
	{
		return CreditScore;
	}

	public void setCreditScore(double creditScore)
	{
		CreditScore = creditScore;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", PanNum=" + PanNum + ", CreditScore="+ CreditScore + "]";
				
	}
    
}
