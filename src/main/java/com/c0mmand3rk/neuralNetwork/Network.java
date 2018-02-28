package com.c0mmand3rk.neuralNetwork;

import java.util.LinkedList;

/**
 * Class Network
 * 
 * @author c0mmand3rk
 *
 */
@SuppressWarnings("serial")
public class Network<T> extends LinkedList<T>
{

    public final static Network<Layer<Neuron>> createNetwork(int numInputNeurons, int numHiddenNeurons,
            int numOutputNeurons)
    {
        Network<Layer<Neuron>> network = new Network<Layer<Neuron>>();
        Layer<Neuron> inputLayer = new Layer<Neuron>().createLayer("inputLayer", numInputNeurons);
        Layer<Neuron> hiddenLayer = new Layer<Neuron>().createLayer("hiddenLayer", numHiddenNeurons);
        Layer<Neuron> outputLayer = new Layer<Neuron>().createLayer("outputLayer", numOutputNeurons);

        network.add(inputLayer);
        network.add(hiddenLayer);
        network.add(outputLayer);

        return network;
    }
}
