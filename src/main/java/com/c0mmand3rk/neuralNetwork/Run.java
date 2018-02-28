package com.c0mmand3rk.neuralNetwork;

/**
 * Class Compute
 * 
 * @author c0mmand3rk
 *
 */
public class Run
{
    public static void main(String[] args)
    {
        Network<Layer<Neuron>> net = Network.createNetwork(1, 5, 1);

        for (Layer<Neuron> layer : net)
        {
            for (Neuron neuron : layer)
            {
                System.out.println(
                        String.format("I'm a neuron %s from layer '%s'.", neuron.getName(), layer.getName()));
                System.out.println(String.format(" input-value:\t%s\n output-value:\t%s", neuron.getInput(),
                        neuron.fire()));
            }
        }
    }
}
