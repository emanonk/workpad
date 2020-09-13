package command;


import commandConfig.AbstractCommand;
import service.AddNoteServiceImpl;

import java.util.List;


public class AddNoteCommand extends AbstractCommand {

    private AddNoteServiceImpl addNoteService;

    public AddNoteCommand(String commandName, AddNoteServiceImpl addNoteService) {
        super(commandName);
        this.addNoteService = addNoteService;
    }

    @Override
    public void execute(String args) {

        System.out.println(args);
        addNoteService.addNote(args);

//        List<BasketItem> basketItems = basketService.convertToBasketItemList(products);
//
//        basketService.applyOffers(basketItems);
//
//        printBasket(basketService.getBasketView(basketItems));

    }



}
