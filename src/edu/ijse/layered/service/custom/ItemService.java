/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;
import edu.ijse.layered.dto.ItemDto;
import java.util.ArrayList;
/**
 *
 * @author Lihini
 */
public interface ItemService {
     public String saveItem(ItemDto itemDto) throws Exception;
    public String updateItem(ItemDto itemDto) throws Exception;
    public String deleteItem(String id) throws Exception;
    public ItemDto searchItem(String id) throws Exception;
    public ArrayList<ItemDto> getALlItem() throws Exception;
}
