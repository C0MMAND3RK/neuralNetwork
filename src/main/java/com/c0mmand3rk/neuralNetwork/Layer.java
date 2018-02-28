package com.c0mmand3rk.neuralNetwork;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Class Layer
 * 
 * @author c0mmand3rk
 *
 */

@SuppressWarnings("serial")
public class Layer<T> extends ArrayList<T>
{
    private String name;

    public final Layer<Neuron> createLayer(String layerName, int numNeurons)
    {
        Layer<Neuron> layer = new Layer<Neuron>();
        layer.setName(layerName);

        IntStream.range(0, numNeurons).forEach(number -> {
            Neuron neuron = new Neuron();
            neuron.setName(String.format("Neuron[%s]", number));
            neuron.setInput(0.1D);
            layer.add(neuron);
        });

        return layer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
