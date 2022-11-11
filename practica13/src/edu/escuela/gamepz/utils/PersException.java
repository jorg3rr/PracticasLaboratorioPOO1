package edu.escuela.gamepz.utils;
public class PersException extends Exception{
	public int poss;
	public PersException(String msg, int poss){
		super(msg);
		this.poss = poss;
	}
	public int getPoss(){
		return poss;
	}
}