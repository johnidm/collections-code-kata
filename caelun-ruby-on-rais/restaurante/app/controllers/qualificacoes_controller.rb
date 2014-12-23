class QualificacoesController < ApplicationController
  before_action :set_qualificacao, only: [:show, :edit, :update, :destroy]

  # GET /qualificacoes
  # GET /qualificacoes.json
  def index
    @qualificacoes = Qualificacao.all
  end

  # GET /qualificacoes/1
  # GET /qualificacoes/1.json
  def show
  end

  # GET /qualificacoes/new
  def new
    @qualificacao = Qualificacao.new
  end

  # GET /qualificacoes/1/edit
  def edit
  end

  # POST /qualificacoes
  # POST /qualificacoes.json
  def create
    @qualificacao = Qualificacao.new(qualificacao_params)

    respond_to do |format|
      if @qualificacao.save
        format.html { redirect_to @qualificacao, notice: 'Qualificacao was successfully created.' }
        format.json { render :show, status: :created, location: @qualificacao }
      else
        format.html { render :new }
        format.json { render json: @qualificacao.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /qualificacoes/1
  # PATCH/PUT /qualificacoes/1.json
  def update
    respond_to do |format|
      if @qualificacao.update(qualificacao_params)
        format.html { redirect_to @qualificacao, notice: 'Qualificacao was successfully updated.' }
        format.json { render :show, status: :ok, location: @qualificacao }
      else
        format.html { render :edit }
        format.json { render json: @qualificacao.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /qualificacoes/1
  # DELETE /qualificacoes/1.json
  def destroy
    @qualificacao.destroy
    respond_to do |format|
      format.html { redirect_to qualificacoes_url, notice: 'Qualificacao was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_qualificacao
      @qualificacao = Qualificacao.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def qualificacao_params
      params[:qualificacao]
    end
end
