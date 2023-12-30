package pl.horus;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;
    private CompositeBlock compositeBlock;
    //        blocks = compositeBlock.getBlocks(); przy każdej metodzie w razie aktualizacji bazy danych w trakcie działania aplikacji

    @Override
    public Optional<Block> findBlockByColor(String color) {
        blocks = compositeBlock.getBlocks();
        return blocks
                .stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        blocks = compositeBlock.getBlocks();
        return blocks
                .stream()
                .filter(block -> block.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        blocks = compositeBlock.getBlocks();
        return blocks.size();
    }
}
