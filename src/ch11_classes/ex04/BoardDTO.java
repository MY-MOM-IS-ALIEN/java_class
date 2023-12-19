package ch11_classes.ex04;

public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private Long boardPass;
//    private int boardViews;
//
//    public int getViews() {
//        return boardViews;
//    }
//
//    public void setViews(int views) {
//        this.boardViews = views;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public Long getBoardPass() {
        return boardPass;
    }

    public void setBoardPass(Long boardPass) {
        this.boardPass = boardPass;
    }


    public static Long idValue = 1L;
//    public static int views = 0;


    public BoardDTO(String boardTitle, String boardWriter, String boardContents, Long boardPass) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardPass = boardPass;
//        this.boardViews = views++;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardPass=" + boardPass +
//                ", boardViews=" + boardViews +
                '}';
    }
}
