package kitchenpos.domain;

public class MenuGroup {
    private Long id;
    private String name;

    private MenuGroup(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MenuGroup of(long id, String name) {
        return new MenuGroup(id,name);
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
