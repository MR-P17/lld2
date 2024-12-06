package com.interview.lld.undoRedo;

import lombok.Data;

import java.util.Stack;

/**
 * Author: Prashant K Singh
 * Date: 07/12/2024
 * Time: 00:33
 */
@Data
public class Invoker {
    Stack<Command> undoStack = new Stack<>();
    Stack<Command> redoStack = new Stack<>();
    TextEditor receiver = new TextEditor();

    public void onClickAddText(String text){
        Command command = new AddTextCommand(receiver, text);
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo(){
        if(!undoStack.empty()){
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo(){
        if(!redoStack.empty()){
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }

    public String getContent(){
        return receiver.getContent();
    }
}
