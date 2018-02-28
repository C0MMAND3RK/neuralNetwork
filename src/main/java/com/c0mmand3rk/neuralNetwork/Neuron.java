package com.c0mmand3rk.neuralNetwork;

/**
 * Class Neuron
 * 
 * @author c0mmand3rk
 *
 */
public class Neuron
{
    private String name;
    private Double input;
    private Double output;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getInput()
    {
        return input;
    }

    public void setInput(Double input)
    {
        this.input = input;
    }

    public Double fire()
    {
        this.output = input + 1;// TODO: insert activation function
        return output;
    }
}
