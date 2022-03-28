import java.text.DecimalFormat;
import java.util.ArrayList;
import java.math.BigInteger;

public class Simplify 
{
	static ArrayList<String> product(String a, String b) 
	{
		//final double EPSILON = .00;
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		ArrayList<String> z_exp_collection = new ArrayList<String>();
		ArrayList<String> a_exp_collection = new ArrayList<String>();
		ArrayList<String> temp1 = new ArrayList<String>();
		ArrayList<String> b_exp_collection = new ArrayList<String>();
		ArrayList<String> temp2 = new ArrayList<String>();
		ArrayList<String> integer = new ArrayList<String>();
		String a_sign="+",a_str="",a_cons="";
		char a_char, exp_a;
		String[] numbers_z = {"1","2","3","4","5","6","7","8","9"};
		String[] numbers= {"0","1","2","3","4","5","6","7","8","9","."};
		String a_lit ="", exp="", a_constant="";
		int count = 0;
		String b_str="",b_sign="+", b_cons="",b_lit=""; 
		char b_char;
		char exp_b;
		ArrayList<String> produkto = new ArrayList<String>();
		char temp1_sign, temp2_sign;
		String temp1_sstr,temp2_sstr;
		String prod_sign = "+";
		String temp1_cons, temp2_cons;
		char one_cons,two_cons;
		ArrayList<String> integer2 = new ArrayList<String>();
		String tmp1_cons, tmp2_cons;
		char temp1_exp, temp2_exp;
		String exptmp1,exptmp2;
		String prod="";
		double temp1_constant=1,temp2_constant=1;
		int exptmp1_1=0, exptmp2_1 = 0;
		String lit_temp1 ="",lit_temp2;
		double product = 0;
		int exp0nent;
		String product_str, exp0nent_str;
		String term_1;
		boolean exp_confirmation=false, exp_confirmation2=false;
		ArrayList<String> term_List1 = new ArrayList<String>();
		String temporary1_cons, temporary2_cons;
	
		
		//convert a to double
	
		
		
		
		
		for(int x=0;x<a.length();x++)
		{
			
			a_char=a.charAt(x);
			a_str = Character.toString(a_char);
			
		
			
			if(a_str.equals("("))
			{
				
				a_char = a.charAt(x+1);
				a_str = Character.toString(a_char);
				a_sign = a_str;
				
				
				for(int x_2=x+2;x_2<a.length();x_2++)
				{
					
					a_char = a.charAt(x_2);
					a_str = Character.toString(a_char);
					
					for(int num=0;num<numbers.length;num++)
					{
						if(a_str.equals(numbers[num]))
						{							
							
							integer.add(a_str);
							
							num = numbers.length;
						}
					}
					if(a_str.equals("x"))
					{
						
						
						
						for(int exp_mv=x_2+2;exp_mv<a.length();exp_mv++)
						{
						
						
							exp_a = a.charAt(exp_mv);
							exp = Character.toString(exp_a);
							
						
							
							for(int v=0;v<numbers.length;v++)
							{
								if(exp.equals(numbers[v]))
								{
									a_exp_collection.add(exp);
									v=numbers.length;
								}
							}
							
							if(exp.equals("+")||exp.equals("-"))
							{
								exp_mv = a.length();
							}
						}
						
						exp = arrayListToString(a_exp_collection);
						
						
						a_exp_collection.clear();
							
							
						a_cons = arrayListToString(integer);
						a_lit = a_sign+a_cons+"x^"+exp;
						integer.clear();
						temp1.add(a_lit);
						
						count=x_2+2;
						x_2=a.length();
						
					}
					else if(a_str.equals("-")||a_str.equals("+"))
					{
						a_cons = arrayListToString(integer);
						a_lit = a_sign +a_cons;
						integer.clear();
						temp1.add(a_lit);
						count = x_2-1;
						x_2=a.length();
						
					}
					else if(x_2==a.length()-1)
					{
						a_cons=arrayListToString(integer);
						
						
						a_lit = a_sign+a_cons;
						
						integer.clear();
						temp1.add(a_lit);
						count=x_2+1;
						x_2=a.length();
					}
					
					
				}
				
				x=count;
				

				
		
			}
			else if(a_str.equals("+")||a_str.equals("-"))
			{
				a_sign = a_str;
				
				
				for(int x_3=x+1;x_3<a.length();x_3++)
				{
					a_char = a.charAt(x_3);
					a_str = Character.toString(a_char);
					
					for(int num_2=0;num_2<numbers.length;num_2++)
					{
						if(a_str.equals(numbers[num_2]))
						{
							
							integer.add(a_str);
							
							num_2=numbers.length;
						}
					}
					
				
					if(a_str.equals("x"))
					{
						
						for(int exp_mv = x_3+2;exp_mv<a.length();exp_mv++)
						{
							exp_a = a.charAt(exp_mv);
							exp = Character.toString(exp_a);
							
							for(int v=0;v<numbers.length;v++)
							{
								if(exp.equals(numbers[v]))
								{
									a_exp_collection.add(exp);
									v=numbers.length;
								}
							}
							
							if(exp.equals("+")||exp.equals("-"))
							{
								exp_mv = a.length();
							}
							
							
						}	
													
					
					
					exp = arrayListToString(a_exp_collection);
					
					
					a_exp_collection.clear();
					
					
						
						a_cons = arrayListToString(integer);
						a_lit  = a_sign+a_cons+"x^"+exp;
						integer.clear();
						temp1.add(a_lit);
						count = x_3+2;
						x_3=a.length();
						
					}
					
					else if(a_str.equals("+")||a_str.equals("-"))
					{
						
						
						a_cons = arrayListToString(integer);
						a_lit = a_sign+a_cons;
						integer.clear();
						temp1.add(a_lit);
						count = x_3-1;
						x_3 = a.length();
						
						
					}
					else if(a_str.equals(")"))
					{
						
						a_cons = arrayListToString(integer);
						
						
						a_lit = a_sign+a_cons;
						integer.clear();
						temp1.add(a_lit);
						x_3=a.length();
						count = a.length();
						
					}
				}
				x=count;
			}
			
		}
		//System.out.println("Here's the temp1: "+temp1);
		
		
		for(int y=0;y<b.length();y++)
		{
			
			b_char=b.charAt(y);
			b_str = Character.toString(b_char);
			
		
			
			if(b_str.equals("("))
			{
				
				b_char = b.charAt(y+1);
				b_str = Character.toString(b_char);
				b_sign = b_str;
				
				
				for(int y_2=y+2;y_2<b.length();y_2++)
				{
					
					b_char = b.charAt(y_2);
					b_str = Character.toString(b_char);
					
					for(int num=0;num<numbers.length;num++)
					{
						if(b_str.equals(numbers[num]))
						{							
							
							integer.add(b_str);
							
							num = numbers.length;
						}
					}
					if(b_str.equals("x"))
					{
						
						for(int exp_mv = y_2+2;exp_mv<b.length();exp_mv++)
						{
							exp_b = b.charAt(exp_mv);
							exp = Character.toString(exp_b);
							
							for(int v=0;v<numbers.length;v++)
							{
								if(exp.equals(numbers[v]))
								{
									b_exp_collection.add(exp);
									v=numbers.length;
								}
							}
							
							if(exp.equals("+")||exp.equals("-"))
							{
								exp_mv = b.length();
							}
							
							
							
						}	
													
					
					
					exp = arrayListToString(b_exp_collection);
					
					
					b_exp_collection.clear();
						
						
						b_cons = arrayListToString(integer);
						b_lit = b_sign+b_cons+"x^"+exp;
						integer.clear();
						temp2.add(b_lit);
						
						count=y_2+2;
						y_2=b.length();
						
					}
					else if(b_str.equals("-")||b_str.equals("+"))
					{
						b_cons = arrayListToString(integer);
						b_lit = b_sign +b_cons;
						integer.clear();
						temp2.add(b_lit);
						count = y_2-1;
						y_2=b.length();
						
					}
					
					else if(y_2==b.length()-1)
					{
						b_cons = arrayListToString(integer);
						b_lit = b_sign + b_cons;
						integer.clear();
						temp2.add(b_lit);
						count=y_2+1;
						y_2=b.length();
					}
					
					
				}
				
				y=count;
				

				
		
			}
			else if(b_str.equals("+")||b_str.equals("-"))
			{
			
				b_sign = b_str;
				
				
				for(int y_3=y+1;y_3<b.length();y_3++)
				{
					b_char = b.charAt(y_3);
					b_str = Character.toString(b_char);
					
					for(int num_2=0;num_2<numbers.length;num_2++)
					{
						if(b_str.equals(numbers[num_2]))
						{
							
							integer.add(b_str);
							
							num_2=numbers.length;
						}
					}
					
				
					if(b_str.equals("x"))
					{
						for(int exp_mv = y_3+2;exp_mv<b.length();exp_mv++)
						{
							exp_b = b.charAt(exp_mv);
							exp = Character.toString(exp_b);
							
							for(int v=0;v<numbers.length;v++)
							{
								if(exp.equals(numbers[v]))
								{
									b_exp_collection.add(exp);
									v=numbers.length;
								}
							}
							
							if(exp.equals("+")||exp.equals("-"))
							{
								exp_mv = b.length();
							}
							
							
						}	
													
					
					
					exp = arrayListToString(b_exp_collection);
					
					
					b_exp_collection.clear();
						b_cons = arrayListToString(integer);
						b_lit  = b_sign+b_cons+"x^"+exp;
						integer.clear();
						temp2.add(b_lit);
						count = y_3+2;
						y_3=b.length();
						
					}
					
					else if(b_str.equals("+")||b_str.equals("-"))
					{
						
						
						b_cons = arrayListToString(integer);
						b_lit = b_sign+b_cons;
						integer.clear();
						temp2.add(b_lit);
						count = y_3-1;
						y_3 = b.length();
						
						
					}
					else if(b_str.equals(")"))
					{
						b_cons = arrayListToString(integer);
						b_lit = b_sign+b_cons;
						integer.clear();
						temp2.add(b_lit);
						y_3=b.length();
						count = b.length();
						
					}
				}
				y=count;
			}
			
		}
		//System.out.println("Here's the temp2:"+temp2);
		
		
	
		for(int z=0;z<temp1.size();z++)
		{
		
			
			temp1_sign = temp1.get(z).charAt(0);
			temp1_sstr = Character.toString(temp1_sign);
			
			for(int move2=0;move2<temp2.size();move2++)
				
			{
				
				
				temp2_sign = temp2.get(move2).charAt(0);
				temp2_sstr = Character.toString(temp2_sign);
				
				
				if(temp1_sstr.equals(temp2_sstr))
				{
					
					
					
					prod_sign = "+";
					
					
					for(int store_cons=1;store_cons<temp1.get(z).length();store_cons++)
					{
						
						one_cons = temp1.get(z).charAt(store_cons);
						temp1_cons = Character.toString(one_cons);
						
						
						for(int mv_integer =0;mv_integer<numbers.length;mv_integer++)
						{
							if(store_cons+1<temp1.get(z).length())
							{
								char one_cons20 = temp1.get(z).charAt(store_cons+1);
								String temp1_cons20 = Character.toString(one_cons20);
								
								if(temp1_cons.equals(".")&&temp1_cons20.equals("0"))
								{
									integer.add(temp1_cons);
									mv_integer=numbers.length;
								}
								
								
								else if(temp1_cons.equals(".")&&one_cons20!='0')
								{
									if(mv_integer<=numbers_z.length)
									{
										if(temp1_cons20.equals(numbers_z[mv_integer]))
										{
											integer.add(temp1_cons);
											mv_integer=numbers.length;
										}
									}
									
									
								}
								
								else if(temp1_cons.equals(numbers[mv_integer]))
								{
									
									integer.add(temp1_cons);
									mv_integer = numbers.length;
									temporary1_cons = arrayListToString(integer);
									
									
									
									//System.out.println(temporary1_cons);
									
									temp1_constant = Double.parseDouble(temporary1_cons);
									
								}
							}
							else
							{
								if(temp1_cons.equals(numbers[mv_integer]))
								{
									
									integer.add(temp1_cons);
									mv_integer = numbers.length;
									
									temporary1_cons = arrayListToString(integer);
									
									
									
									//System.out.println(temporary1_cons);
									
									temp1_constant = Double.parseDouble(temporary1_cons);
									
								}
							}
							
							
							
						}
						
						
						
						
						lit_temp1="";
						
						
						if(temp1_cons.equals("x"))
						{
							
							
							integer.clear();
							
							for(int exp_mv = store_cons+2;exp_mv<temp1.get(z).length();exp_mv++)
							{
								temp1_exp = temp1.get(z).charAt(exp_mv);
								
								exptmp1 = Character.toString(temp1_exp);
								
								for(int v=0;v<numbers.length;v++)
								{
									if(exptmp1.equals(numbers[v]))
									{
										z_exp_collection.add(exptmp1);
										v=numbers.length;
									}
								}
								
								if(exptmp1.equals("+")||exp.equals("-"))
								{
									exp_mv = temp1.get(z).length();
								}
								
								
							}	
														
						
						
						exptmp1 = arrayListToString(z_exp_collection);
						
						
						z_exp_collection.clear();
							
							
							
							
							exp_confirmation = true;
							exptmp1_1 = Integer.parseInt(exptmp1);
							
							lit_temp1="x^";
							store_cons = temp1.get(z).length();
						
							
						}
						else if(store_cons==temp1.get(z).length()-1)
						{
							//System.out.println("Here's the constant: "+store_cons);
							integer.clear();
							exp_confirmation=false;
							exptmp1_1=0;
							store_cons = temp1.get(z).length();
						}
					}
					for(int store_cons2=1;store_cons2<temp2.get(move2).length();store_cons2++)
					{
						
						two_cons = temp2.get(move2).charAt(store_cons2);
						temp2_cons = Character.toString(two_cons);
						
						for(int mv2_integer =0;mv2_integer<numbers.length;mv2_integer++)
						{
							if(store_cons2+1<temp2.get(move2).length())
							{
								char two_cons21 = temp2.get(move2).charAt(store_cons2+1);
								String temp2_cons21 = Character.toString(two_cons21);
								
								if(temp2_cons.equals(".")&&temp2_cons21.equals("0"))
								{
									
									integer2.add(temp2_cons);
									mv2_integer=numbers.length;
								}
								else if(temp2_cons.equals(".")&&two_cons21!='0')
								{
									if(mv2_integer<=numbers_z.length)
									{
										if(temp2_cons21.equals(numbers_z[mv2_integer]))
										{
											integer2.add(temp2_cons);
											mv2_integer=numbers.length;
										}
									}
									
									
								}
								
								else if(temp2_cons.equals(numbers[mv2_integer]))
								{
									
									integer2.add(temp2_cons);
									mv2_integer = numbers.length;
									
									temporary2_cons= arrayListToString(integer2);
									
									temp2_constant = Double.parseDouble(temporary2_cons);
								}
							}
							else
							{
								if(temp2_cons.equals(numbers[mv2_integer]))
								{
									
									integer2.add(temp2_cons);
									mv2_integer = numbers.length;
									
									temporary2_cons= arrayListToString(integer2);
									
									temp2_constant = Double.parseDouble(temporary2_cons);
									
								}
							}
							
							
							
						}
						
						
						
						lit_temp2 = "";
						
						
						if(temp2_cons.equals("x"))
						{
							
							integer2.clear();
							
							
							for(int exp_mv = store_cons2+2;exp_mv<temp2.get(move2).length();exp_mv++)
							{
								temp2_exp = temp2.get(move2).charAt(exp_mv);
								
								exptmp2 = Character.toString(temp2_exp);
								
								for(int v=0;v<numbers.length;v++)
								{
									if(exptmp2.equals(numbers[v]))
									{
										z_exp_collection.add(exptmp2);
										v=numbers.length;
									}
								}
								
								if(exptmp2.equals("+")||exp.equals("-"))
								{
									exp_mv = temp2.get(move2).length();
								}
								
								
							}	
														
						
						
						exptmp2 = arrayListToString(z_exp_collection);
						
						
						z_exp_collection.clear();
							
							
							
							
							exptmp2_1 = Integer.parseInt(exptmp2);
							lit_temp1 ="x^";
							store_cons2 = temp2.get(move2).length();
							exp_confirmation2 = true;
						}
						
						
					else if(store_cons2==temp2.get(move2).length()-1)
						{
							//System.out.println("Here's the constant: "+store_cons2);
							integer2.clear();
							exp_confirmation2=false;
							exptmp2_1=0;
							store_cons2 = temp2.get(move2).length();
						}
						
					}
					
					/*System.out.println("Here's the exponent of temp1:"+exptmp1_1);
					System.out.println("Here's the constant of temp1:"+temp1_constant);
					System.out.println("Here's the exponent of temp2:"+exptmp2_1);
					System.out.println("Here's the constant of temp2:"+temp2_constant);*/
					
					if(exp_confirmation==true||exp_confirmation2==true)
					{
						product = temp2_constant*temp1_constant;
						product_str = df.format(product);
						
					
						if(product==0)
						{
							
							
							
						}
						else
						{
							
							
							exp0nent = exptmp2_1+exptmp1_1;
							
							exp0nent_str = Integer.toString(exp0nent);
							term_1 = prod_sign+product_str + lit_temp1+exp0nent_str;
							term_List1.add(term_1);
						}
						
						
						
					}
					else
					{
						
						product = temp2_constant*temp1_constant;
						product_str = df.format(product);
						
						if(product==0)
						{
						
							
						
						}
						
						else
						{
							
						
							term_1 = prod_sign+product_str;
							term_List1.add(term_1);
						}
						
						
					}
					
				}
				
				
				
				
				///////////////////////////////
				else if(temp1_sign!=temp2_sign)
				{
					
					
					prod_sign = "-";
					
					
					for(int store_cons=1;store_cons<temp1.get(z).length();store_cons++)
					{
						
						one_cons = temp1.get(z).charAt(store_cons);
						temp1_cons = Character.toString(one_cons);
						
						
						for(int mv_integer =0;mv_integer<numbers.length;mv_integer++)
						{
							if(store_cons+1<temp1.get(z).length())
							{
								char one_cons20 = temp1.get(z).charAt(store_cons+1);
								String temp1_cons20 = Character.toString(one_cons20);
								
								if(temp1_cons.equals(".")&&temp1_cons20.equals("0"))
								{
									integer.add(temp1_cons);
									mv_integer=numbers.length;
								}
								
								
								else if(temp1_cons.equals(".")&&one_cons20!='0')
								{
									if(mv_integer<=numbers_z.length)
									{
										if(temp1_cons20.equals(numbers_z[mv_integer]))
										{
											integer.add(temp1_cons);
											mv_integer=numbers.length;
										}
									}
									
									
								}
								
								else if(temp1_cons.equals(numbers[mv_integer]))
								{
									
									integer.add(temp1_cons);
									mv_integer = numbers.length;
									
									temporary1_cons = arrayListToString(integer);
									
									
									
									//System.out.println(temporary1_cons);
									
									temp1_constant = Double.parseDouble(temporary1_cons);
								}
								
								
							}
							else
							{
								if(temp1_cons.equals(numbers[mv_integer]))
								{
									
									integer.add(temp1_cons);
									mv_integer = numbers.length;
									
									temporary1_cons = arrayListToString(integer);
									
									
									
									//System.out.println(temporary1_cons);
									
									temp1_constant = Double.parseDouble(temporary1_cons);
									
								}
							}
							
						}
						
						
						
						
						lit_temp1="";
						
						if(temp1_cons.equals("x"))
						{
							
							
							integer.clear();
							
							for(int exp_mv = store_cons+2;exp_mv<temp1.get(z).length();exp_mv++)
							{
								temp1_exp = temp1.get(z).charAt(exp_mv);
								
								exptmp1 = Character.toString(temp1_exp);
								
								for(int v=0;v<numbers.length;v++)
								{
									if(exptmp1.equals(numbers[v]))
									{
										z_exp_collection.add(exptmp1);
										v=numbers.length;
									}
								}
								
								if(exptmp1.equals("+")||exp.equals("-"))
								{
									exp_mv = temp1.get(z).length();
								}
								
								
							}	
														
						
						
						exptmp1 = arrayListToString(z_exp_collection);
						
						
						z_exp_collection.clear();
							
							
							
							
							exp_confirmation = true;
							exptmp1_1 = Integer.parseInt(exptmp1);
							
							lit_temp1="x^";
							store_cons = temp1.get(z).length();
						
							
						}
						else if(store_cons==temp1.get(z).length()-1)
						{
							//System.out.println("Here's the constant: "+store_cons);
							integer.clear();
							exp_confirmation=false;
							exptmp1_1=0;
							store_cons = temp1.get(z).length();
						}
					}
					for(int store_cons2=1;store_cons2<temp2.get(move2).length();store_cons2++)
					{
						
						two_cons = temp2.get(move2).charAt(store_cons2);
						temp2_cons = Character.toString(two_cons);
						
						for(int mv2_integer =0;mv2_integer<numbers.length;mv2_integer++)
						{
							if(store_cons2+1<temp2.get(move2).length())
							{
								char two_cons21 = temp2.get(move2).charAt(store_cons2+1);
								String temp2_cons21 = Character.toString(two_cons21);
								
								if(temp2_cons.equals(".")&&temp2_cons21.equals("0"))
								{
									integer2.add(temp2_cons);
									mv2_integer=numbers.length;
								}
								else if(temp2_cons.equals(".")&&two_cons21!='0')
								{
									if(mv2_integer<=numbers_z.length)
									{
										if(temp2_cons21.equals(numbers_z[mv2_integer]))
										{
											integer2.add(temp2_cons);
											mv2_integer=numbers.length;
										}
									}
									
									
								}
								
								else if(temp2_cons.equals(numbers[mv2_integer]))
								{
									
									integer2.add(temp2_cons);
									mv2_integer = numbers.length;
									
									temporary2_cons= arrayListToString(integer2);
									
									temp2_constant = Double.parseDouble(temporary2_cons);
								}
							}
							else
							{
								if(temp2_cons.equals(numbers[mv2_integer]))
								{
									
									integer2.add(temp2_cons);
									mv2_integer = numbers.length;
									
									temporary2_cons= arrayListToString(integer2);
									
									temp2_constant = Double.parseDouble(temporary2_cons);
								}
							}
							
						}
						
						
						
						lit_temp2 = "";
						
						
						if(temp2_cons.equals("x"))
						{
							
							integer2.clear();
							
							
							for(int exp_mv = store_cons2+2;exp_mv<temp2.get(move2).length();exp_mv++)
							{
								temp2_exp = temp2.get(move2).charAt(exp_mv);
								
								exptmp2 = Character.toString(temp2_exp);
								
								for(int v=0;v<numbers.length;v++)
								{
									if(exptmp2.equals(numbers[v]))
									{
										z_exp_collection.add(exptmp2);
										v=numbers.length;
									}
								}
								
								if(exptmp2.equals("+")||exp.equals("-"))
								{
									exp_mv = temp2.get(move2).length();
								}
								
								
							}	
														
						
						
						exptmp2 = arrayListToString(z_exp_collection);
						
						
						z_exp_collection.clear();
							
							
							
							
							exptmp2_1 = Integer.parseInt(exptmp2);
							lit_temp1 ="x^";
							store_cons2 = temp2.get(move2).length();
							exp_confirmation2 = true;
						}
						
						
						else if(store_cons2==temp2.get(move2).length()-1)
						{
							//System.out.println("Here's the constant: "+store_cons2);
							integer2.clear();
							exp_confirmation2=false;
							exptmp2_1=0;
							store_cons2 = temp2.get(move2).length();
						}
						
					}
					/*System.out.println("Here's the exponent of temp1:"+exptmp1_1);
					System.out.println("Here's the constant of temp1:"+temp1_constant);
					System.out.println("Here's the exponent of temp2:"+exptmp2_1);
					System.out.println("Here's the constant of temp2:"+temp2_constant);*/
					if(exp_confirmation==true||exp_confirmation2==true)
					{
						product = temp2_constant*temp1_constant;
						product_str = df.format(product);
						
					
						if(product==0)
						{
							
							
							
						}
						else
						{
							
							
							exp0nent = exptmp2_1+exptmp1_1;
							
							exp0nent_str = Integer.toString(exp0nent);
							term_1 = prod_sign+product_str + lit_temp1+exp0nent_str;
							term_List1.add(term_1);
						}
						
						
						
					}
					else
					{
						
						product = temp2_constant*temp1_constant;
						product_str = df.format(product);
						
						if(product==0)
						{
						
							
						
						}
						
						else
						{
							
						
							term_1 = prod_sign+product_str;
							term_List1.add(term_1);
						}
						
						
					}
					
				}
				
				
				
				
				
			}
			
		}
		
		return term_List1;
		
		
		
		
	}
	
	static ArrayList<String> addition(ArrayList<String> Term_List1)
	{
		DecimalFormat df = new DecimalFormat("###,###.00");
		String[] numbers= {"0","1","2","3","4","5","6","7","8","9","."};
		char List1_sign_chr, List1_cons_chr,List2_cons_chr;
		String List1_sign = "+",List1_cons,List2_cons;
		ArrayList<String> List1_cons_list = new ArrayList<String>();
		ArrayList<String> List2_cons_list2 = new ArrayList<String>();
		ArrayList<String> List1_lit = new ArrayList<String>();
		ArrayList<String> List2_lit = new ArrayList<String>();
		char List1_lit_coe, List2_lit_coe;
		String List1_lit_coe1,List2_lit_coe2;
		String term_1="",term_2 = "";
		String constant1="",constant2="";
		char List2_sign_chr;
		String List2_sign="";
		int sum=0, constant1_int=0, constant2_int = 0;
		String sum_str="";
		double constant1_integer =0,constant2_integer = 0;
		double sum_cons = 0;
		String sum_cons_str="";
		String Term_F="";
		
		
		
		for(int bilang = 0;bilang<Term_List1.size()-1;bilang++)
		{
			
			
			List1_sign_chr = Term_List1.get(bilang).charAt(0);
			List1_sign = Character.toString(List1_sign_chr);
			
			for(int store_cons_term1=1;store_cons_term1<Term_List1.get(bilang).length();store_cons_term1++)
			{
				List1_cons_chr = Term_List1.get(bilang).charAt(store_cons_term1);
				List1_cons = Character.toString(List1_cons_chr);
				
				for(int galaw=0;galaw<numbers.length;galaw++)
				{
					
					if(List1_cons.equals(numbers[galaw]))
					{
					
						List1_cons_list.add(List1_cons);
						galaw = numbers.length;
					}
				}
				
				constant1 = arrayListToString(List1_cons_list);
				
				
				if(List1_cons.equals("x"))
				{
					
					
					for(int count_exp_list1=store_cons_term1;count_exp_list1<Term_List1.get(bilang).length();count_exp_list1++)
					{
						
						List1_lit_coe = Term_List1.get(bilang).charAt(count_exp_list1);
						List1_lit_coe1 = Character.toString(List1_lit_coe);
						
						
						
						if(List1_lit_coe!='(')
						{
							List1_lit.add(List1_lit_coe1);
						}
						
					}
					
					term_1=arrayListToString(List1_lit);
					store_cons_term1=Term_List1.get(bilang).length();
					List1_cons_list.clear();
					List1_lit.clear();
				}
				
				else if(store_cons_term1==Term_List1.get(bilang).length()-1)
				{
					
					List1_cons_list.clear();
					
					term_1="";
				}
				
			
				
				
				
			}
			
			
			
			///////////////////////////////////
		for(int bilang2=bilang+1;bilang2<Term_List1.size();bilang2++)
		{
			List2_sign_chr = Term_List1.get(bilang2).charAt(0);
			List2_sign = Character.toString(List2_sign_chr);
			
			for(int store_cons_term2=1;store_cons_term2<Term_List1.get(bilang2).length();store_cons_term2++)
			{
				List2_cons_chr = Term_List1.get(bilang2).charAt(store_cons_term2);
				List2_cons = Character.toString(List2_cons_chr);
				
				for(int galaw=0;galaw<numbers.length;galaw++)
				{
					if(List2_cons.equals(numbers[galaw]))
					{
						List2_cons_list2.add(List2_cons);
						galaw = numbers.length;
					}
				}
				
				constant2 = arrayListToString(List2_cons_list2);
				
				
				if(List2_cons.equals("x"))
				{
					
					
					for(int count_exp_list2=store_cons_term2;count_exp_list2<Term_List1.get(bilang2).length();count_exp_list2++)
					{
						List2_lit_coe = Term_List1.get(bilang2).charAt(count_exp_list2);
						List2_lit_coe2 = Character.toString(List2_lit_coe);
						
						if(List2_lit_coe!=')')
						{
							List2_lit.add(List2_lit_coe2);
						}
					
						
					}
					
					term_2=arrayListToString(List2_lit);
					store_cons_term2=Term_List1.get(bilang2).length();
					List2_cons_list2.clear();
					List2_lit.clear();
				}
				
				else if(store_cons_term2==Term_List1.get(bilang2).length()-1)
				{
					List2_cons_list2.clear();
					
					term_2="";
				}
				
			
				
				
				
			}
			
			
			
			if(term_1.equals(term_2))
			{
			
				
				if(List1_sign.equals(List2_sign))
				{
					constant1_integer=Double.parseDouble(constant1);
					constant2_integer=Double.parseDouble(constant2);
					sum_cons=constant1_integer+constant2_integer;
					sum_cons_str=df.format(sum_cons);
					Term_F=List1_sign+sum_cons_str+term_2;
					
					Term_List1.set(bilang, Term_F);
					Term_List1.remove(bilang2);
					bilang2=Term_List1.size();
					bilang--;
					
				}
				
				else
			{
				constant1_integer=Double.parseDouble(constant1);
				constant2_integer=Double.parseDouble(constant2);
				
				if(constant1_integer>constant2_integer)
				{
					sum_cons=constant1_integer-constant2_integer;
					sum_cons_str=df.format(sum_cons);
					Term_F=List1_sign+sum_cons_str+term_2;
					
					Term_List1.set(bilang,Term_F );
					Term_List1.remove(bilang2);
					bilang2=Term_List1.size();
					bilang--;
				}
				else if(constant1_integer<constant2_integer)
				{
					sum_cons = constant2_integer-constant1_integer;
					sum_cons_str = df.format(sum_cons);
					Term_F = List2_sign + sum_cons_str+term_2;
					
					Term_List1.set(bilang, Term_F);
					Term_List1.remove(bilang2);
					bilang2=Term_List1.size();
					bilang--;
				}
				
				else if(constant1_integer==constant2_integer)
				{
					Term_List1.remove(bilang2);
					Term_List1.remove(bilang);
					bilang2=Term_List1.size();
					bilang--;
					
				}
			}
			}
			
			
			
		
			
			
			
			}
		
		
		}
		
		//replace the ')' to ""
		for(int x=0;x<Term_List1.size();x++)
		{
			String trm1 = Term_List1.get(x);
			trm1=trm1.replace(")", "");
			Term_List1.set(x, trm1);
			
		}
		
		
		ArrayList<String> Term_List2 = new ArrayList<String>(Term_List1);
		return Term_List2;
		
	
	}
	
	static ArrayList<String> ToArrayList(String str_term)
	{
		//Initialization
		char character1;
		String str1="";
		ArrayList<String> multi_poly = new ArrayList<String>();
		ArrayList<String> term = new ArrayList<String>();
		int count = 0;
		String term_str="";
		
		for(int x=0;x<str_term.length();x++)
		{
			character1 = str_term.charAt(x);
			str1=Character.toString(character1);
			
			if(str1.equals("("))
			{
				for(int x_same=x;x_same <str_term.length();x_same++)
				{
					character1 = str_term.charAt(x_same);
					str1 = Character.toString(character1);
					
					if(character1!=')')
					{
						term.add(str1);
						
					}
					
					else if(str1.equals(")"))
					{
						term.add(str1);
						count = x_same;
						x_same = str_term.length();
						
						term_str = arrayListToString(term);
						multi_poly.add(term_str);
						term.clear();
						
					}
				}
				
				x=count;
			
			}
		}
		
		return multi_poly;
	}
	
	static ArrayList<String> multiply_many_parenthesis(ArrayList<String> multi_poly)
	{
		//Initialization
		String tm1 = "",tm2="";
		String tm_i = "";
		String tm_F = "", tm_f="";
		
	
		for(int x=0;x<multi_poly.size()-1;x++)
		{
			for(int y=x+1;y<multi_poly.size();y++)
			{
				tm1 = multi_poly.get(x);
				tm2 = multi_poly.get(y);
				
				tm_i = arrayListToString1(Simplify.product(tm1, tm2));
				
				//System.out.println(tm_i);
				
				multi_poly.set(x, tm_i);
				multi_poly.remove(y);
				
				
				y=multi_poly.size();
				
			}
			x--;
			//System.out.println(multi_poly);
		}
		
		
		
		
		return multi_poly;
	}
	
	static String arrayListToString(ArrayList<String> a)
	{
		String str="";
		
		for(int s_1=0;s_1<a.size();s_1++)
		{
			str=str+a.get(s_1);
		}
		
		
		return str;
	}
	
	static String arrayListToString1(ArrayList<String> a)
	{
		String str="";
		
		for(int s_1=0;s_1<a.size();s_1++)
		{
			str=str+a.get(s_1);
		}
		
		
		return "("+str+")";
	}
	
	static ArrayList<String> stringToArrayList(String str)
	{
		ArrayList<String> List = new ArrayList<String>();
		char character1;
		String s_t_r = "";
		ArrayList<String> trm = new ArrayList<String>();
		String sign="";
		String term_A="";
		String term_i ="";
		int count = 0;
		ArrayList<String> sample1 = new ArrayList<String>();
		
		for(int x=0;x<str.length();x++)
		{
			
			character1=str.charAt(x);
			sign = Character.toString(character1);
			
			if(sign.equals("+")||sign.equals("-"))
			{
				
				
				trm.add(sign);
				
				for(int x_same=x+1;x_same<str.length();x_same++)
				{
					character1 = str.charAt(x_same);
					term_A = Character.toString(character1);
					
					
					
					if(x_same!=str.length()-1)
					{
						
						if(character1!='-'&&character1!='+')
						{
							
							trm.add(term_A);
							term_i=arrayListToString(trm);
						}
						
						else if(character1=='-'||character1=='+')
						{
							
							List.add(term_i);
							count = x_same;
							x_same = str.length();
							trm.clear();
						}
					}
					
					
					
					else if(x_same==str.length()-1)
					{
						
						trm.add(term_A);
						term_i=arrayListToString(trm);
						
						List.add(term_i);
						count = x_same;
						x_same = str.length();
						trm.clear();
					}
				}
				x=count-1;
			}
			
		}
		
		return List;
		
	}
	
	static ArrayList<String> storage_differences (ArrayList<Double> numbers,int le_search, int size, int h)
	{
		DecimalFormat df = new DecimalFormat("###,###.00");
		double store1=0;
		String store2="";
		ArrayList<String> differences1 = new ArrayList<String>();
		int diff=h;
		
		//convert h into double
		double h_2 = Double.valueOf(h);
		
		double middle = Math.round(h_2/2);
		
		
	
	
		
		if(h<size&&h<=le_search+1)
		{
			
			for(int x=h,y=x,f=0;diff<numbers.size();x++,f++)
			{
				
				if(x==h)
				{
				
					store1 = numbers.get(y);
					
					if(store1<0.0)
					{
						//convert double into string
						store2 = df.format(store1);
						
						differences1.add(store2);
						diff=diff+(size-f);
					}
					else
					{
						//convert double into string
						store2 = "+"+df.format(store1);
						
						differences1.add(store2);
						diff=diff+(size-f);
					}
					
					
					
				}
				
				else
				{
					store1 = numbers.get(diff);
					
					if(diff<numbers.size())
					{
						if(store1<0.0)
						{
							store2 = df.format(store1);
							
							differences1.add(store2);
							diff = diff+(size-f);
						}
						else
						{
							store2 = "+"+df.format(store1);
							
							differences1.add(store2);
							diff = diff+(size-f);
						}
						
					
					}
					else if(diff>=numbers.size())
					{
						
						diff=numbers.size();
					}
					
				}
			}
			
			return differences1;
			
		}
		else
		{
			for(int x=h,y=x,f=1;diff<numbers.size();x++,f++)
			{
				
				if(x==h)
				{
				
					store1 = numbers.get(y);
					
					if(store1<0.0)
					{
						//convert double into string
						store2 = df.format(store1);
						
						differences1.add(store2);
						diff=diff+(size-f);//3+(6-1)==>8
					}
					else
					{
						//convert double into string
						store2 = "+"+df.format(store1);
						
						differences1.add(store2);
						diff=diff+(size-f);//3+(6-1)==>8
					}
					
					
					
				}
				
				else
				{
					store1 = numbers.get(diff);
					
					if(diff<numbers.size())
					{
						if(store1<0.0)
						{
							store2 = df.format(store1);
							
							differences1.add(store2);
							diff = diff+(size-f);
						}
						else
						{
							store2 = "+"+df.format(store1);
							
							differences1.add(store2);
							diff = diff+(size-f);
						}
						
					
					}
					else if(diff>=numbers.size())
					{
						
						diff=numbers.size();
					}
					
				}
			}
			
			return differences1;
		}
		
		
	}
	
	static ArrayList<String> forward_diff (int num,int h)
	{
		//Initialization
		ArrayList<String> forward = new ArrayList<String>();
		String str1 = "+1x^1";
		int sum,hi_integer, hi_int2=h;
		String str_i="";
		String str_h="",h_2="",h_F="";
		
		//if h is not equal to zero
		if(h!=0)
		{
			h_2=String.valueOf(hi_int2);
			h_F="-"+h_2;
			hi_integer=Integer.valueOf(h_F);
		}
		else
		{
			hi_integer=0;
			
		}
		
		for(int count=0,drop=0;count<num;count++,drop++)
		{////////////
			
			hi_int2 = hi_integer-drop;//0-1=>-1
		
			if(hi_int2==0)//t
			{
				str_h=String.valueOf(hi_int2);
				str_i="("+str1+")";
				forward.add(str_i);
			
			}
			
			else if(hi_int2!=0)
			{
				
				str_h=String.valueOf(hi_int2);
				str_i="("+str1+str_h+")";
				forward.add(str_i);
			}
		}
		
		return forward;
	}
	
	static ArrayList<String> backward_diff (int num,int h)
	{
		//Initialization
				
				ArrayList<String> backward = new ArrayList<String>();
				String str1 = "+1x^1";
				int sum,hi_integer, hi_int2=h;
				String str_i="";
				String str_h="",h_2="",h_F="";
				
				//if h is not equal to zero
				if(h!=0)
				{
					h_2=String.valueOf(hi_int2);
					h_F="-"+h_2;
					hi_integer=Integer.valueOf(h_F);
				}
				else
				{
					hi_integer=0;
					
				}
				
				for(int count=0,drop=0;count<num;count++,drop++)
				{////////////
					
					hi_int2 = hi_integer+drop;//0-1=>-1
				
					if(hi_int2==0)//t
					{
						str_h=String.valueOf(hi_int2);
						str_i="("+str1+")";
						backward.add(str_i);
					
					}
					
					else if(hi_int2!=0)
					{
						
						str_h=String.valueOf(hi_int2);
						str_i="("+str1+str_h+")";
						backward.add(str_i);
					}
				}
				
				return backward;
	}
	
	static ArrayList<Integer> hSearch (ArrayList<Double> num, int sizefx)
	{
		
		
		ArrayList<Integer> h_elements = new ArrayList<Integer>();
		double num_element;
		String num_str;
		int initial_stage=0;
		boolean f_confirmation = true;
		//[1,2,9,28,65,1,7,19,37,6,12,18,6,6,0]
		for(int x=0;x<sizefx;x++)
		{
		
			for(int y=x+sizefx,deduction=1,stage=1;y<num.size();deduction++,stage++)
			{
				//identify if the element is zero
				//if zero ang element i-stored ang x sa h_elements;
				num_element = num.get(y);
				num_str = Double.toString(num_element);
				
				if(num_str.equals("0.0")&&f_confirmation==true)
				{
					
						f_confirmation=false;
						initial_stage=stage;
					
						
						h_elements.add(x);
						
						
						y=num.size();
					
					
				
				}
				else if(num_str.equals("0.0")&&stage==initial_stage)
				{
				
					h_elements.add(x);
					
					y=num.size();
				}
				else
				{
					y=y+(sizefx-deduction);//y+(5-deduction)
				}
			}
		}
		
		
		return h_elements;
	}
	
	static int Factorial(int num)
	{
		BigInteger factorial = BigInteger.ONE;
		
		for(int x = 2; x<=num;x++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(x));
		}
		
		//conver BigInteger to int
		int result =factorial.intValue();
		
		return result;
	}
	
	static void Table(ArrayList<Double> numbers, int sz)
	{
		//get the last int<element> in hSearch
		ArrayList<Integer> hash = hSearch(numbers,sz);

		
		int hash_sz = hash.size();
	
		
		int hsearch = hash.get(hash_sz-1);
		
		
		//System.out.println("Here's the hsearch: "+hsearch);
		
		double getelem,getelem2;
		
		
		String elem_str,elem_str2;
		int store_stage=0, store_stage2=0;
		String df = "f(x)";
		String elem_get1 ="";
		int getelem_indx;
		double getelem_dob1;
		
		//get the last difference stage of the numbers
		for(int x=0,f=0,stage=1;x<numbers.size();)
		{
			if(x==0) 
			{
				//find if the x==0 has the value of element that was zero
				for(int y=0;y<numbers.size();f++,stage++)
				{
				
					
					
					if(stage>2)
					{
						
						
						getelem = numbers.get(y);
						
					
						
						elem_str= String.valueOf(getelem);
					
						
						if(elem_str.equals("0.0"))
						{
							
							
							getelem_indx= y-(sz-f);
							
							
							getelem_dob1 = numbers.get(getelem_indx);
							
							
							elem_get1=String.valueOf(getelem_dob1);
						
							
							store_stage = stage;
							
							//end the loop
							y=numbers.size();
							x=numbers.size();
							
						}
						else
						{
							if(y==0)
							{
								
								y=y+(sz-f);
							}
							else
							{
								y=y+(sz-f);
							}
						}
					
					}
					else
					{
						if(y==0)
						{
							
							y=y+(sz-f);
						}
						else
						{
							y=y+(sz-f);
						}
					}
					
				}
				
				
			}
			
		}
		
		//store_stage should be increase by 1 for the x column
		++store_stage;
		
		//print out the labels above ==> x, f(x), f(x)
		//b serves as the move in the store_stage
		for(int b=0,f=-1;b<store_stage;b++,f++)
		{
			if(b==0)
			{
				System.out.print("x\t");
			}
			else if(b==1)
			{
				System.out.print(df+"\t");
			}
			else if(b>1&&b<store_stage-1)
			{
				System.out.print("d"+f+"_"+df+"\t");
			}
			else
			{
				System.out.println("d"+f+"_"+df);
			}
		}
		
		//hsearch = 2
		//5 ==> store_stage
		//print-out the table
		//<z serves as the move correspond to size>
		
		for(int z=0;z<sz;z++)
		{
			if(z<=hsearch)
			{
				for(int z2=z,diff=0,stage1=1;stage1<=store_stage;stage1++,diff++)
				{
					//print-out the z value if the z2==0
					if(stage1==1)
					{
						System.out.print(z+"\t");
						diff--;
						
					}
					else
					{
						//get the element of the numbers.get(z2)
						getelem2 = numbers.get(z2);
						elem_str2 = String.valueOf(getelem2);
						
						System.out.print(elem_str2+"\t");
						z2 = z2+(sz-diff);
						
					}
				}
			}
			else
			{
				store_stage--;
				for(int z2=z,diff=0,stage1=1;stage1<=store_stage;stage1++,diff++)
				{
					//print-out the z value if the z2==0
					if(stage1==1)
					{
						System.out.print(z+"\t");
						diff--;
						
					}
					else
					{
						if(z==hsearch+1)
						{
							//get the element of the numbers.get(z2)
							getelem2 = numbers.get(z2);
							elem_str2 = String.valueOf(getelem2);
							
							System.out.print(elem_str2+"\t");
							z2 = z2+(sz-diff);
							
						}
						else
						{
							//get the element of the numbers.get(z2)
							getelem2 = numbers.get(z2);
							elem_str2 = String.valueOf(getelem2);
							
							System.out.print(elem_str2+"\t");
							z2 = z2+(sz-diff);
							
						}
						
					}
				}
			}
			
			
			System.out.println();
		}
	}
	static String eliminateZero(ArrayList<String> result)
	{
		String element;
		String theResult;
		
		for(int x=0;x<result.size();x++)
		{
			element=result.get(x);
			
			if(element.equals("+.00"))
			{
				result.remove(x);
			}
		}
		
		//after removing the zero element
		//convert it into string
		theResult=arrayListToString(result);
		return theResult;
	}
	
	
}