/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxdraganddrop;

import java.io.Serializable;

/**
 *
 * @author ddren
 */
public class Country  implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String name = "";

	public Country(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
