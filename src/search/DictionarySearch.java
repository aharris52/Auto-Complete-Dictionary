package search;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Stores a dictionary that provides definitions given a word
 * or partial matching for words in the dictionary.
 *
 * @author ???
 * @version 1.0
 */
public class DictionarySearch implements IDictionary
{
    /**
     * Creates a new search object with a dictionary loaded and
     * ready for searching.
     */
    public DictionarySearch()
    {

    }

    @Override
    public String getDefinition(String word)
    {
        return null;
    }

    @Override
    public String[] getPartialMatches(String search)
    {
        return null;
    }
}
