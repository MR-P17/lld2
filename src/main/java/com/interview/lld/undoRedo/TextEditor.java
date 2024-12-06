package com.interview.lld.undoRedo;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 07/12/2024
 * Time: 00:25
 */
@Data
public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void addText(String text){
        content.append(text);
    }

    public void removeText(String text){
        int index = content.lastIndexOf(text);
        if(index >= 0){
            content.delete(index, index + text.length());
        }
    }

    public String getContent(){
        return content.toString();
    }
}
