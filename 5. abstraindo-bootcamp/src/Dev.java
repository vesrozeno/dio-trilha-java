
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> signedContentList = new LinkedHashSet<>();
    private Set<Content> concludedContentList = new LinkedHashSet<>();

    public void signToBootcamp(Bootcamp bootcamp) {

        this.signedContentList.addAll(bootcamp.getContentList());
        bootcamp.getSignedDevs().add(this);
    }

    public void progress() {
        Optional<Content> conteudo = this.signedContentList.stream().findFirst();
        if (conteudo.isPresent()) {
            this.concludedContentList.add(conteudo.get());
            this.signedContentList.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        return this.concludedContentList.stream().mapToDouble(conteudo -> conteudo.calculateXp()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSignedContentList() {
        return signedContentList;
    }

    public void setSignedContentList(Set<Content> signedContentList) {
        this.signedContentList = signedContentList;
    }

    public Set<Content> getConcludedContentList() {
        return concludedContentList;
    }

    public void setConcludedContentList(Set<Content> concludedContentList) {
        this.concludedContentList = concludedContentList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((signedContentList == null) ? 0 : signedContentList.hashCode());
        result = prime * result + ((concludedContentList == null) ? 0 : concludedContentList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (signedContentList == null) {
            if (other.signedContentList != null)
                return false;
        } else if (!signedContentList.equals(other.signedContentList))
            return false;
        if (concludedContentList == null) {
            if (other.concludedContentList != null)
                return false;
        } else if (!concludedContentList.equals(other.concludedContentList))
            return false;
        return true;
    }

}
