package oop.onlineShop.storage.impl;

import oop.onlineShop.enteties.Order;
import oop.onlineShop.storage.OrderStoringService;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class DefaultOrderStoringService implements OrderStoringService {
    private static final String ORDER_DATA_FILE_NAME = "orders.data";
    private static final String CURRENT_TASK_RESOURCE_FOLDER = "finaltask";
    private static final String RESOURCE_FOLDER = "resources";

    private static DefaultOrderStoringService instance;
    public DefaultOrderStoringService(){}


    @Override
    public void saveOrder(List<Order> order) {
        try(var oos = new ObjectOutputStream(new FileOutputStream(
                RESOURCE_FOLDER + File.separator + CURRENT_TASK_RESOURCE_FOLDER +
                        File.separator + ORDER_DATA_FILE_NAME
        ))){
            oos.writeObject(order);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> loadOrder() {
        try(var ois = new ObjectInputStream(new FileInputStream(
                RESOURCE_FOLDER + File.separator + CURRENT_TASK_RESOURCE_FOLDER +
                        File.separator + ORDER_DATA_FILE_NAME
        ))){
            return (List<Order>) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public static OrderStoringService getInstance(){
        if(instance == null){
            instance = new DefaultOrderStoringService();
        }
        return instance;
    }
}
