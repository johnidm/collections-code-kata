package br.com.johnidouglas.rest.resources.impl;

import br.com.johnidouglas.rest.resources.Item;
import br.com.johnidouglas.rest.resources.ItemResource;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;

@Path("/v1/item")
public class ItemResourceImpl implements ItemResource {

    @Override
    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(100, "Widget", "A basic widget"));
        items.add(new Item(200, "SuperWidget", "A super widget"));
        items.add(new Item(300, "UberSuperWidget", "A uber super widget"));

        return items;
    }
}
