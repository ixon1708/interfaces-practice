public interface Identifiable {

    Long getId();

    void setId(Long id);

    void setName(String name);

    String getName();

    default boolean equalTo (Identifiable identifiable) {
        return this.getClass().equals(identifiable.getClass())
                && getId().equals(identifiable.getId());
    }

    default void printIdentifiable() {
        System.out.println(getClass().getSimpleName() + ": id = " + getId() + ", name = " + getName());
    }

}
