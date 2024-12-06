package com.interview.lld.undoRedo;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 07/12/2024
 * Time: 00:30
 */
@Data
public class AddTextCommand implements Command{
    private String text;
    private TextEditor receiver;

    public AddTextCommand(TextEditor receiver, String text){
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public void execute() {
        receiver.addText(text);
    }

    @Override
    public void undo() {
        receiver.removeText(text);
    }
}
