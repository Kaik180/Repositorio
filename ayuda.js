import { Link, useParams, useNavigate } from "react-router-dom";
import useGlobalReducer from "../hooks/useGlobalReducer";
import { useState, useEffect } from "react";

export const FormEdit = () => {
  const { dispatch, store } = useGlobalReducer();
  const { theId } = useParams();
  const navigate = useNavigate();

  const [updateData, setUpdateData] = useState({
    name: "",
    phone: "",
    email: "",
    address: ""
  });

  // Cargar el contacto actual desde el store
  useEffect(() => {
    const contact = store.contacts.find(c => c.id == theId);
    if (contact) setUpdateData(contact);
  }, [theId, store.contacts]);

  // Manejar cambios en los inputs
  const handleChange = e => {
    const { id, value } = e.target;
    setUpdateData({ ...updateData, [id]: value });
  };

  // Función para actualizar contacto
  const updateContact = async (id, data) => {
    try {
      const response = await fetch(
        `https://playground.4geeks.com/contact/agendas/ana/contacts/${id}`,
        {
          method: "PUT",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify(data)
        }
      );

      const result = await response.json();

      if (!response.ok) {
        alert("Error al actualizar contacto: " + (result?.msg || "desconocido"));
        return;
      }

      dispatch({ type: "UPDATE_CONTACT", payload: result });
      alert("Contacto actualizado ");
      navigate("/");
    } catch (error) {
      console.error(error);
      alert("Error inesperado ");
    }
  };

  // Botón de guardar cambios
  const handleSubmit = () => {
    updateContact(theId, updateData);
  };

  return (
    <div className="container mt-2">
      <div className="mb-3">
        <label htmlFor="name">Full Name</label>
        <input
          type="text"
          id="name"
          value={updateData.name}
          onChange={handleChange}
          className="form-control"
        />
      </div>
      <div className="mb-3">
        <label htmlFor="email">Email</label>
        <input
          type="email"
          id="email"
          value={updateData.email}
          onChange={handleChange}
          className="form-control"
        />
      </div>
      <div className="mb-3">
        <label htmlFor="phone">Phone</label>
        <input
          type="text"
          id="phone"
          value={updateData.phone}
          onChange={handleChange}
          className="form-control"
        />
      </div>
      <div className="mb-3">
        <label htmlFor="address">Address</label>
        <input
          type="text"
          id="address"
          value={updateData.address}
          onChange={handleChange}
          className="form-control"
        />
      </div>
      <div className="d-flex">
        <Link to="/">
          <button className="btn btn-secondary">Volver</button>
        </Link>
        <button className="btn btn-success ms-2" onClick={handleSubmit}>
          Guardar cambios
        </button>
      </div>
    </div>
  );
};
