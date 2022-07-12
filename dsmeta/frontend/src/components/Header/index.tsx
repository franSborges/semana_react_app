import iconLogo from "../../assets/img/image 1.svg";
import "./styles.css";

function Header() {
  return (
    <>
      <header>
        <div className="dsmeta-logo-container">
            <img src={iconLogo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/franb0rges.dev">@franb0rges.dev</a>
            </p>
        </div>
    </header>
      
    </>
    
  )
}

export default Header;

