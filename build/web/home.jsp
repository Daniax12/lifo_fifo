 <div class="col-lg-8" style="margin-right: auto; margin-left: auto;">
    <div class="card" >
        <div class="card-header"> Mouvement </div>
        <div class="card-body">
            <div class="card-title">
                <h3 class="text-center title-2"> Faire une sortie de stock </h3>
            </div>
            <hr>
            <form action="" method="post" novalidate="novalidate">
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-payment" class="control-label mb-1"> Date </label>
                    <div class="col-lg-12 col-md-9">
                        <input type="date" id="disabled-input" name="date_mouvement" class="form-control">
                    </div>
                </div>
                <div class="form-group has-success">
                    <label for="cc-name" class="control-label mb-1"> Produits </label>
                    <div class="col-lg-12 col-md-9">
                        <select name="prouduit" id="select" class="form-control">
                            <option value="0">Please select</option>
                            <option value="1">Oignon</option>
                            <option value="2">Tomate</option>
                            <option value="3">Riz</option>
                        </select>
                    </div>
                </div>
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-number" class="control-label mb-1"> Fournisseurs </label>
                    <div class="col-lg-12 col-md-9">
                        <select name="frn" id="select" class="form-control">
                            <option value="0">Please select</option>
                            <option value="1">Jumbo Score</option>
                            <option value="2">Shoprite</option>
                            <option value="3">Tsena</option>
                        </select>
                    </div>
                </div>
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-payment" class="control-label mb-1"> Prix unitaire </label>
                    <div class="col-lg-12 col-md-9">
                        <input type="number" id="disabled-input" name="pu" class="form-control" placeholder="0.0">
                    </div>
                </div>
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-payment" class="control-label mb-1"> Quantity </label>
                    <div class="col-lg-12 col-md-9">
                        <input type="number" id="disabled-input" name="qty" class="form-control" placeholder="0.0">
                    </div>
                </div>
                <div>
                    <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                        <span id="payment-button-amount">Save</span>
                        <span id="payment-button-sending" style="display:none;">Sending?</span>
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>